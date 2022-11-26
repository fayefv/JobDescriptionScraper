package main;/*
Takes job descriptions in the form of URLs and possibly files and stores raw text.
Raw text can be parsed in a number of ways.
*/

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class URLReader {

    private Document doc;


    /*
    Constructor should do all the work.
     */
    public URLReader(String myUrl) {
        // connects to website and builds the DOM
        try {
            doc = Jsoup.connect(myUrl).get();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public JobListing buildJobListing() {

        var jobUrl = doc.location();

        return new JobListing(jobUrl, doc.outerHtml(), getSelectContent(), doc.text());

    }

    /*
       collects elements of interest: by default we collect headers h1 and h3,
       to capture job title we use h3 ~ p,
       to capture key requirements we collect li
        */
    private String getSelectContent() {

        var selectedContent = doc.select("h1, h3, h3 ~ p, li");
        StringBuilder sb = new StringBuilder();
        for (var element : selectedContent) {
            sb.append(element.text());
            sb.append("\n");
        }
        return sb.toString();
    }


}
