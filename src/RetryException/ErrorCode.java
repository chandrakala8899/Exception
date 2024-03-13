package RetryException;

public enum ErrorCode {

    TIMEOut_Error_Code("200","TIMEOUT EXCEPTION"),
    INSUFFICIENT_ERROR_CODE("2002","INSUFFICIENT EXCEPTION");
    private String code;
     private  String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    ErrorCode(String code, String message){
         this.code = code;
         this.message = message;
     }

}
