import java.io.File;
import java.util.Scanner;

/*
Does the real meat of the work
 */
public class Controller {

    public static final String input_file_folder = "C:\\Users\\Faye\\Documents\\IDEA Files\\Input\\";

    public Controller() {
        try {
            Scanner scanner = new Scanner(new File(input_file_folder + "someJobListings.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.getStackTrace();
        }

//        var test_file_name = new SimpleDateFormat("HH:mm:s-MMddyy'.txt'").format(new Date()); // placeholder filename generator
//        System.out.println(test_file_name);

//        var cw = new ContentWriter();
//        var urlReader = new URLReader(test_url);
//
//
//
//
//        cw.writeMyContent(test_file_name, urlReader.buildJobListing().getSelectedContent());


    }


}
