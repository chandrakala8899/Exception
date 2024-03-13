package Recruitment;

public class ApplicationException extends Exception{
    String msg;

    public ApplicationException(String message,String msg) {
       super(message);
       this.msg = msg;
    }
}
