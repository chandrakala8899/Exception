package Exception;

public class RunTimeException extends RuntimeException{
    String code;

    public RunTimeException(String code,String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {

        return code;
    }
}
