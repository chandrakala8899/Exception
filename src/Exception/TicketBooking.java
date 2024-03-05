package Exception;

public class TicketBooking extends BookMyShowUser {
    int noOfSeats;

    public TicketBooking(String userName, String passWord,int noOfSeats) {
        super(userName, passWord);
        this.noOfSeats = noOfSeats;
    }

    public int getNoOfSeats()
    {
        return noOfSeats;
    }

}
