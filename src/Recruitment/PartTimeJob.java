package Recruitment;

public class PartTimeJob extends Job {
    private int noOfHoursInaDay;

    public PartTimeJob(String title, String description, String postingdate, int noOfHoursInaDay) {
        super(title, description, postingdate);
        this.noOfHoursInaDay = noOfHoursInaDay;
    }

    public double getSalary() {
        return noOfHoursInaDay;
    }

    @Override
    public boolean Apply(Candidate candiate) throws ApplicationException {
        if (candiate.getExperience() <= 1) {
            System.out.println("we have at least 1 year experience");
        }
        else {
            System.out.println(" Applications failed");
            throw new ApplicationException(ErrorCode.PART_TIME_JOB.getCode(), ErrorCode.PART_TIME_JOB.getMessage());

    }return false;
}
}