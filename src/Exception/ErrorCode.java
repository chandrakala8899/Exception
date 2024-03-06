package Exception;

public enum ErrorCode{

    Payment_failed(" payment failed","401"),
   login_failed_1("invalidotp","402");
    String message;
    String code;

    public String getCode() {
        return code;
    }

    public String getMessage() {

        return message;
    }

     ErrorCode(String message,String code){

        this.message = message;
        this.code = code ;
    }

}
