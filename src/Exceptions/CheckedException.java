package Exceptions;

public class CheckedException extends Exception{
    String code;

    public String getCode() {
        return code;
    }

    public CheckedException(String message, String code) {
        super(message);
        this.code = code;
    }

    @Override
    public String getMessage() {
        return code;
    }
}
