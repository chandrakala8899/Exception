package Recruitment;

public abstract class Job {

    private String title;
    private String description;
    private String postingdate;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getpostingDate() {
        return postingdate;
    }

    public Job(String title, String description, String postingdate) {
        this.title = title;
        this.description = description;
        this.postingdate = postingdate;


          } public abstract  boolean Apply(Candidate candiate) throws ApplicationException;
    }

