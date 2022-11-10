import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
Does the real meat of the work
 */
public class Controller {

    public static final String input_file_folder = "C:\\Users\\Faye\\Documents\\IDEA Files\\Input\\";

    private ArrayList<String> newJobs;

    public Controller() {
        newJobs = new ArrayList<>();

        // gets the urls of a new batch of job postings
        try {
            Scanner scanner = new Scanner(new File(input_file_folder + "someJobListings.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                newJobs.add(line);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }


        var cw = new ContentWriter();

        for (var j : newJobs) {

            // placeholder filename generator
            var test_file_name = new SimpleDateFormat("HH-mm-sS-MMddyyyy'.txt'").format(new Date());
            var urlReader = new URLReader(j);
            var jobPost = urlReader.buildJobListing();
            cw.writeMyContent(test_file_name, jobPost.getJobURL(), jobPost.getSelectedContent());

        }

    }

}
