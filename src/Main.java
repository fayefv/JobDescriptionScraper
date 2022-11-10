import java.text.SimpleDateFormat;
import java.util.Date;

/*

Client class

@author Faye Fong
 */
public class Main {


    public static final String test_url = "https://gilead.yello.co/jobs/q8iiiUhgI6m4NHpSAkK-OA?job_board_id=v42vD4vKxb3AkKvV93YsrQ";

    public static void main(String[] args) {

        var test_file_name = new SimpleDateFormat("HH:mm:s-MMddyy'.txt'").format(new Date());
        System.out.println(test_file_name);

//        var cw = new ContentWriter();
//        var urlReader = new URLReader(test_url);
//
//        // placeholder filename generator
//
//
//        cw.writeMyContent(test_file_name, urlReader.buildJobListing().getSelectedContent());


    }
}
