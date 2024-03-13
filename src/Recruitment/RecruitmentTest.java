package Recruitment;

public class RecruitmentTest {
    public static void main(String[] args) {
        RecruitmentProcess process = new RecruitmentProcess();
        Job fullTimeJob = new FullTimeJob("engineer", "   ", "new date()", 20000);
        process.addjob(fullTimeJob);
        Job parTimeJob = new PartTimeJob("software", "   ", "new date()", 2);
        process.addjob(parTimeJob);

        Candidate candidate = new Candidate() {
            @Override
            public int getExperience() {
                return 4;
            }
        };
        process.addCandiate(candidate);
        process.applyJob(candidate, fullTimeJob);
        Candidate candidate2 = new Candidate() {
            @Override
            public int getExperience() {
                return 1;
            }
        };
        process.addCandiate(candidate2);
        process.applyJob(candidate2, parTimeJob);
        process.noOfApplications(2);
    }
    }

