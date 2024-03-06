package Exception;

public class PaymentProcess extends PhonePayPayment{
    int remainingSeats;
    int noOfSeats;

    public PaymentProcess(String userName, String passWord, int noOfSeats, int acbalance, int otp) {
        super(userName, passWord, noOfSeats, acbalance, otp);
    }


    public int getRemainingSeats() {

        return remainingSeats;
    }
    public int getNoOfSeats()
    {
        return noOfSeats;
    }
    public int PaymentProcess(int acbalance, int otp,int noOfSeats) throws PaymentException {
        this.acbalance = 1000;
        this.otp = 1234;
        int TotalavailableSeats = 15;
        int totalSeats = 0;
        if (acbalance == getAcbalance() && otp==getOtp()) {
            System.out.println("Login Succesful ");
            if (noOfSeats <= TotalavailableSeats) {
                remainingSeats= TotalavailableSeats - noOfSeats;

                System.out.println("Booking seats =" + noOfSeats);
                System.out.println("Remaining seats = " + remainingSeats);

            }
        } else {
            remainingSeats = TotalavailableSeats - noOfSeats;
            System.out.println("After booking available seats"+"   "+remainingSeats);
            System.out.println("hold seats= "+noOfSeats);
            System.out.println("Payment Canceled ");
            totalSeats = remainingSeats+noOfSeats;
            System.out.println("After Payment Canceled No.of Seats" + " : "+remainingSeats+  "+" + noOfSeats+"="+totalSeats);
            throw new RunTimeException(ErrorCode.login_failed_1.getMessage(), ErrorCode.login_failed_1.getCode());
        }

        return TotalavailableSeats;
    }


    }



