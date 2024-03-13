package RetryException;

public class BookMyShowService {

    public void bookTicket() {
        SBIService sbiService = new SBIService();
        for(int i = 1;i <3;)
        try {
            sbiService.transfer();
            i = 4;
        } catch (TimeOutException ex) {
            System.out.println("ERROR Ocurred " + ex);
            i = i+1;
        }catch (Exception s){
            i =4;
            System.out.println("error occured : " +s);
        }

    }
}
