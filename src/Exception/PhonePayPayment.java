package Exception;

public class PhonePayPayment  extends TicketBookinProcess{
     int acbalance ;
     int otp;

    public PhonePayPayment(String userName, String passWord, int noOfSeats,int acbalance,int otp) {
        super(userName, passWord, noOfSeats);
        this.acbalance = acbalance;
        this.otp = otp;
    }

    public int getAcbalance() {
        return acbalance;
    }

    public int getOtp() {
        return otp;
    }


}
