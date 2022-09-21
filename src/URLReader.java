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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;


public class URLReader {
    public static void main(String[] args) {

        String title = "";
        Document doc = null;
        try {
            doc = Jsoup.connect("https://gilead.yello.co/jobs/SFVW6FkP2XDe_-o0rfhM2Q?job_board_id=v42vD4vKxb3AkKvV93YsrQ").get();
        } catch (Exception e) {
            e.printStackTrace();
        }

        var headers = doc.select("h1, h2, h3, h4, h5, h6");
        var delimiters = new ArrayList<String>();
        for (var h : headers) { // Headers used to separate sections in the document
            if (h.hasText())
                delimiters.add(h.text());
        }


    }
}