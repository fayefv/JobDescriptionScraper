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
            doc = Jsoup.connect("https://gilead.yello.co/jobs/SFVW6FkP2XDe_-o0rfhM2Q?job_board_id=v42vD4vKxb3AkKvV93YsrQ").get();
            title = doc.title();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        Fooling around learning how the DOM (Document Object Model) can be accessed
        Fundamentally useful understanding of HTML scraping
         */

        // so we have created the doc object from fetching and parsing HTML from the given URL
        // calling .text() on the whole DOM gets you everything
        // but we could try accessing specific elements of the HTML
        // let's start specific with Gilead style job listings and work on generalizing
        // the scraper later

        /*
        How to get all the elements in a doc object?
        Let's figure out how to map out all the elements of a doc

         */
        var content = doc.getAllElements();
        for(var e : content){

            // grab all children that have text
            // there are advanced methods for filtering nodes, traversing depth first
            // but that is too much work / specific for the scope of this project

            // build a job object with attributes like Job Requisition ID


            // what are the key elements we want to store?
            // URL, job posting, location, required skills
            // not possible to pick out elements and then get text content bc tags are generic
            // you can navigate by nesting, but this will not be generalizable
            // similarly you can build specific JQuery but may not be general solution
            // grab most likely to be relevant text such as h and li
            // grab all text and regex search
            // can do a hybrid approach to cross-reference content of interest
            // for e.g., get everything that's an li
            // get raw text and regex for after a ':'

            // can recurse through child nodes and grab text through a filter

            // text() usefully collapses potentially confusing hierarchy



            System.out.println("class: " + e.className() + ", tag: " + e.tagName() + ", text: " + e.wholeOwnText()); // shows everything and its tag but
           // current strategy is to iterate through elements
           /*  TODO: look at the more sophisticated methods for getting children / filtering nodes
             because I don't like the way some of the formatted text is out of readable order
             then you can strip what you want
             and make a job object

            */

            
            // grab all headers, spans, divs, p, li
            // substitute very null text element with \n
            // divide by newlines into a human-readable text document
            // include the URL of origin




            // the nested structure is not obvious
            // how can we see the node family in an HR way?
            // Element tags are not super informational
            // class types are useful info but not general


            // li is list elements which is probably what we're looking for most
            // headings are useful, because they represent job titles and major sections
            // underlined, bolded text
            // nested tags relationship can help pull out important content

//            System.out.println(e.tagName()); // similar to to node Names
//            System.out.println(e.normalName()); // similar to nodeName
            // System.out.println(e.nodeName()); // provides element types
            // System.out.println(e.id()); // provides id names but not human readable or helpful
            // System.out.println(e.ownText()); // provides all the text
        }


//        var content = doc.getElementById("content"); // content is null
//        var innerTextOutput = content.getElementById("innerTextOutput");








 //       System.out.println(title);


//        System.out.println(doc.wholeText()); // flattens text but with newlines
        // doesn't make a ton of difference because the display relies on p structure not \n

//        System.out.println(doc.text()); // this flattens all text
        // but does not keep newlines

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