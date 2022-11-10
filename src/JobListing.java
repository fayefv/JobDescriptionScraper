import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
Represents a specific job posting
 */
public class JobListing {

    private String jobURL;
    private String selectedContent;
    private String flattenedContent;
    private String companyName;
    private String jobTitle;
    private String jobID;

    /*
    Minimum constructor
     */
    public JobListing(String jobURL, String selectedContent, String flattenedContent) {

        this.jobURL = jobURL;
        this.selectedContent = selectedContent;
        this.flattenedContent = flattenedContent;

        // set default values to empty str
        this.companyName = "";
        this.jobTitle = "";
        this.jobID = "";
    }

    public String getSelectedContent() {
        return selectedContent;
    }

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
