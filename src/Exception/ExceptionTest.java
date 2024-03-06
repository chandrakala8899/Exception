package Exception;

public class ExceptionTest {
    public static void main(String[] args) {

        PaymentProcess process = new PaymentProcess("chandu","1234",10,1000,2244);
       try{
           process.PaymentProcess(1000,1234,10);
           process.ticketBooking("chandu","1234");

       }catch (RunTimeException runTimeException) {
           System.out.println("code =" + runTimeException.getCode() + "message =" + runTimeException.getMessage());

       } catch (PaymentException e) {
           System.out.println("code =" +e.getCode() + "message =" +e.getMessage());
       }
    }

    }