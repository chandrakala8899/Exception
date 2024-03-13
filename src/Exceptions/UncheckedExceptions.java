package Exceptions;

public class UncheckedExceptions extends RuntimeException{
  String code;

    public UncheckedExceptions(String code,String message) {
        super(message);
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
