package Recruitment;

import java.util.ArrayList;

public class RecruitmentProcess implements Applications {
    public String getJobs() {
        return jobs;
    }

    public String getCandiates() {
        return candiates;
    }

    private String jobs;
    private String candiates;

    public RecruitmentProcess() {

        this.jobs = "SSC JE";
        this.candiates = "B TECH Completed candiates";
    }

    public void addjob(Job job) {

    }

    public void addCandiate(Candidate candidate) {
    }

    public void applyJob(Candidate candidate, Job job) {
        try {
            job.Apply(candidate);
            System.out.println("Application sucessful");
        } catch (ApplicationException applicationException) {
            System.out.println(applicationException);

        } catch (ExceedApplicationExceptions applicationExceptions) {
            System.out.println("Exceed Applications : " + applicationExceptions);

        }
    }

    @Override
    public int noOfApplications(int n) {



            if (n <= 4) {
                for (int i = 1; i <= n; i++) {
                    System.out.println("print n value  " + i);
                    System.out.println("application proceed");
                }
            }else {
                System.out.println("Application failed");
            }

        return n;
    }
}

