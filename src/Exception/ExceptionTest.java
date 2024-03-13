package Exception;

public class ExceptionTest {
    public static void main(String[] args) {
        PaymentProcess process = new PaymentProcess("chandu","2244",10,1000,1234);
        try{
           // process.PaymentProcess(1000,33,10);
            process.ticketBooking("chandu","2244");
            process.PaymentProcess(1000,124,10);

        }catch (RunTimeException runTimeException) {
            System.out.println("code =" + runTimeException.getCode() + "message =" + runTimeException.getMessage());

        } catch (PaymentException e) {
            System.out.println("code =" +e.getCode() + "message =" +e.getMessage());
       }
    }

    }