package RetryException;

public class BookMYshowProcess {
   public void bookTicket(){
      try{
         BookMyShowService process = new BookMyShowService();
         process.bookTicket();
      }catch (Exception e){
         System.out.println("eccor occured " +e);
      }finally {
         System.out.println("finnaly excuted");
      }
   }


}
