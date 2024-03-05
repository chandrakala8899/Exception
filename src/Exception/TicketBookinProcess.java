package Exception;

public class TicketBookinProcess extends TicketBooking{
    int Remainingseats;

    public TicketBookinProcess(String userName, String passWord, int noOfSeats) {
        super(userName, passWord, noOfSeats);
    }

    public int getRemainingseats() {
        return Remainingseats;
    }

    public int ticketBooking(String userName, String passWord) throws PaymentException {
        this.passWord = "9908";
        this.userName = "chandu";
        int TotalavailableSeats = 15;
        int totalSeats = 0;

        if (userName.equals(getUserName()) && passWord.equals(getPassWord())) {
            System.out.println("Login Succesful ");
            if (noOfSeats <= TotalavailableSeats) {
                Remainingseats = TotalavailableSeats - noOfSeats;

                System.out.println("Booking seats =" + noOfSeats);
                System.out.println("Remaining seats = " + Remainingseats);

            }
        } else {
            Remainingseats = TotalavailableSeats - noOfSeats;
            System.out.println("After booking available seats"+"   "+Remainingseats);
            System.out.println("hold seats= "+noOfSeats);
            System.out.println("Payment Canceled ");
            totalSeats = Remainingseats+noOfSeats;
            System.out.println("After Payment Canceled No.of Seats" + " : "+Remainingseats+  "+" + noOfSeats+"="+totalSeats);
            throw new PaymentException(ErrorCode.Payment_failed.getCode(), ErrorCode.Payment_failed.getMessage());
        }
        return totalSeats;
    }

}
