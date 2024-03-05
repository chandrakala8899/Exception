package Exception;

public class RunTimeException extends RuntimeException{
    String otp;

    public RunTimeException(String otp) {
        this.otp = otp;
    }

    public String getOtp() {
        return otp;
    }
}
