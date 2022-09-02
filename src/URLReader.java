/*
Takes job descriptions in the form of URLs and possibly files and stores raw text.
Raw text can be parsed in a number of ways.
 */
//public class JobLoader {
//
//    public JobLoader(String url) {
//        // TODO: choose some methodology for cURLing
//    }
//}

import org.jsoup.*;
import org.jsoup.nodes.Document;

import java.net.*;
import java.io.*;

// TODO: jsoup is an HTML Parser for Java - do not reinvent the wheel
public class URLReader {
    public static void main(String[] args) {

        String title = "";
        Document doc = null;
        try {
            doc = Jsoup.connect("https://gilead.yello.co/jobs/cEmSSasAK6YphsfL6fOcGQ?job_board_id=v42vD4vKxb3AkKvV93YsrQ").get();
            title = doc.title();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(title);
        System.out.println(doc.text()); // this gets all relevant text

        // get more specific with scraping elements of the text
        // the so-called DOM elements
        // get new lines working


//        URL url;
//
//        try {
//            // get URL content
//
//            String a="https://gilead.yello.co/jobs/cEmSSasAK6YphsfL6fOcGQ?job_board_id=v42vD4vKxb3AkKvV93YsrQ";
//            url = new URL(a);
//            URLConnection conn = url.openConnection();
//
//            // open the stream and put it into BufferedReader
//            BufferedReader br = new BufferedReader(
//                    new InputStreamReader(conn.getInputStream()));
//
//            String inputLine;
//            while ((inputLine = br.readLine()) != null) {
//                System.out.println(inputLine);
//            }
//            br.close();
//
//            System.out.println("Done");
//
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}