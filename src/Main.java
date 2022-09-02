/*

Client class

@author Faye Fong
 */
public class Main {

    public static final String test_file_name = "test_file_1.txt";

    public static void main(String[] args) {

        var cw = new ContentWriter();
        cw.writeMyContent(test_file_name, cw.test_str);

    }
}
