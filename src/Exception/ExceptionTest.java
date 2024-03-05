package Exception;

public class ExceptionTest {
    public static void main(String[] args) {
        TicketBookinProcess ticketBookinProcess = new TicketBookinProcess("chandu", "990", 10);
        try {
            ticketBookinProcess.ticketBooking("chandu", "990");
        } catch (PaymentException e) {

            System.out.println(e.getMessage() + "" + e.getCode());

//     }catch (RunTimeException e){
//         throw  new PaymentExceptio;
//
//     }

        }
    }}