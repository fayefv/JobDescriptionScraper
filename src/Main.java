/*

Client class

@author Faye Fong
 */
public class Main {

    public static final String test_file_name = "test_file_1.txt";
    public static final String test_url = "https://gilead.yello.co/jobs/q8iiiUhgI6m4NHpSAkK-OA?job_board_id=v42vD4vKxb3AkKvV93YsrQ";

    public static void main(String[] args) {

        var cw = new ContentWriter();
        var urlReader = new URLReader(test_url);
//        System.out.println("TIGHTER\n\n" + urlReader.getContentStr());
        cw.writeMyContent(test_file_name, urlReader.getContentStr());


    }
}
