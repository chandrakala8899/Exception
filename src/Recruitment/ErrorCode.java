package Recruitment;

public enum ErrorCode {

    FULL_TIME_JOB("101","Application Exception"),
    PART_TIME_JOB("102","Application Exception"),
    APPLICATIONS_RECRUIT("103","NO OF APPLICATIONS EXCEPTIONS");
    String code ;
    String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
