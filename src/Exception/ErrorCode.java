package Exception;

public enum ErrorCode {

    Payment_failed("Error Code_","401"),
    payment_failed("invalidMobibleNumber","402");
    String message;
    String code;

    public String getCode() {
        return code;
    }

    public String getMessage() {

        return message;
    }

     ErrorCode(String message,String code){

        this .message = message;
        this.code = code ;
    }

}
