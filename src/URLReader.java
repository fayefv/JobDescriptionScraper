/*
Takes job descriptions in the form of URLs and possibly files and stores raw text.
Raw text can be parsed in a number of ways.
*/

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.ArrayList;
import java.util.HashMap;


public class URLReader {

    Document doc;
    String contentStr;

    /*
    Constructor should do all the work.
     */
    public URLReader(String myUrl) {
        try {
            doc = Jsoup.connect(myUrl).get(); // builds DOM
        } catch (Exception e) {
            e.printStackTrace();
        }

        var contentOfInterest = doc.select("h1, h1 ~ p, h1 ~ ul, h3, h3 ~ p, h3 ~ul");
        StringBuilder sb = new StringBuilder();
        for (var element : contentOfInterest)
            sb.append(element);


        contentStr = sb.toString();


    }

    public String getContentStr() {


        return contentStr;
    }


    // TODO: make li have \n as well

//        var formattedContent = new ArrayList<String>();
//        // choose how to write results for utility
//        for (var element : contentOfInterest) {
//            var text = element.text();
//            if (text.isBlank() || text.isEmpty())
//                text = "\n";
//            formattedContent.add(text);
//        }

//        for(var content : formattedContent)
//            System.out.println(content);


//        var content = doc.text();
//        var headers = doc.select("h1, h2, h3, h4, h5, h6");
//        var slicedContent = new HashMap<String, String>();
//
//
//        var sectionTitles = new ArrayList<String>();
//        for (var h : headers) {
//            if (h.hasText()) sectionTitles.add(h.text());
//        }

//        for (var x : sectionTitles)
//            System.out.println((x));

//       var content0 = StringUtils.substringBetween(content, sectionTitles.get(0), sectionTitles.get(1));
//
//
//        System.out.println(content0);


//        for (int idx = 0; idx < sectionTitles.size() - 1; idx++) {
//            slicedContent.put(sectionTitles.get(idx), StringUtils.substringBetween(content, sectionTitles.get(idx), sectionTitles.get(idx + 1)));
//
//        }
//
//
//        for( var k : slicedContent.keySet()){
//            System.out.println(k + ", " + slicedContent.get(k));
//
//        }

}
