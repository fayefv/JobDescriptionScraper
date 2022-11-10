/*
Writes job descriptions from the web to file.  Prevents loss of data from link rot, and forms the basis for job
description word analysis.

@author Faye Fong
 */
import java.io.*;

public class ContentWriter {

    public final String output_file_folder = "C:\\Users\\Faye\\Documents\\IDEA Files\\Output";

    /*
       a test function to see set up where files are written
       TODO: integrate with Google Drive for cloud access and functionalities
        */
    public void writeMyContent(String output_file_name, String originURL, String content_str) {
        try {
            var fw = new FileWriter(new File(output_file_folder, output_file_name));
            fw.write(originURL + '\n' + content_str);
            fw.close();
        } catch (Exception e) {
            e.getStackTrace();
        }

    }


}
