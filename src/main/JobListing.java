package main;

import org.apache.commons.lang3.builder.ToStringExclude;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/*
Represents a specific job posting
 */
public class JobListing {

    private String jobURL;
    private String outerHtml;
    private String selectedContent;
    private String flattenedContent;
    private String companyName;
    private String jobTitle;
    private String jobID;


    /*
        Minimum constructor
         */
    public JobListing(String jobURL, String outerHtml, String selectedContent, String flattenedContent) {

        this.jobURL = jobURL;
        this.outerHtml = outerHtml;
        this.selectedContent = selectedContent;
        this.flattenedContent = flattenedContent;

        // set default values to empty str
        this.companyName = "";
        this.jobTitle = "";
        this.jobID = "";
    }

    public void makeWordFrequencyTable(String content){

        var str_arr = content.split("\\b");
        Map<String, MutableInteger> counterMap = new HashMap<>();
        counterWithMutableInteger(str_arr, counterMap);

        // Print out k,v using Iterator
        Iterator<String> itr = counterMap.keySet().iterator();
        while (itr.hasNext()){
            var k = itr.next();
            System.out.println(k + ": " + counterMap.get(k).getCount());
        }


    }
    private void counterWithMutableInteger(String[] contentList, Map<String, MutableInteger> counterMap){
        for(String word: contentList){
            counterMap.compute(word, (k,v) -> v == null ? new MutableInteger() : v).increment();
        }
    }

    private static class MutableInteger{

        int count = 0;

        public int getCount(){ return count; }

        public void increment() { this.count++; }


    }

    public String getOuterHtml() { return outerHtml;}

    public String getSelectedContent() {
        return selectedContent;
    }

    public String getFlattenedContent() { return flattenedContent; }

    public String getJobURL() {
        return jobURL;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }
}

