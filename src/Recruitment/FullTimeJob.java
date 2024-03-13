package Recruitment;

public class FullTimeJob extends Job {

    private double salary;

    public FullTimeJob(String title, String description, String postingdate, double salary) {
        super(title, description, postingdate);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean Apply(Candidate candiate) throws ApplicationException {
        if (candiate.getExperience() <= 3) {

            System.out.println(" We have at least 3 expirence");


        } else {
            System.out.println("application failed");
            throw new ApplicationException(ErrorCode.FULL_TIME_JOB.getCode(), ErrorCode.FULL_TIME_JOB.getMessage());
            // throw new ExceedApplicationExceptions(ErrorCode.APPLICATIONS_RECRUIT.getCode(), ErrorCode.APPLICATIONS_RECRUIT.getMessage());

        }return false;

    }
}
