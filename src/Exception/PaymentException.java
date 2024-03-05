package Exception;

public class PaymentException extends  Exception{
    int remainingSeats;
    String code;

    public String getCode() {
        return code;
    }
    public int getRemainingSeats() {
        return remainingSeats;
    }
    public PaymentException(String code, String megssage) {
        super(megssage);
        this .code = code;


    }
}
