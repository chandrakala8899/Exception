package Exceptions;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class ExceptTest {
    public static void main(String[] args) {
        ExceptionProcess exceptionProcess = new ExceptionProcess();
//        boolean number = false;
//        while (number) {
//
            try {
                exceptionProcess.Exceptions("4", "9");
                exceptionProcess.ExceptionProcessOdd(9);
//                number = true;
            } catch (CheckedException ex) {
//
//                String countRead = UUID.randomUUID().toString();
//                Calendar countReadExpiryTime = Calendar.getInstance();
//                countReadExpiryTime.add(Calendar.FIELD_COUNT, 1);
//                System.out.println("count read expire time : " + countReadExpiryTime.getTime());
     //           Date countReadExpireTime = countReadExpiryTime.getTime();
                 System.out.println("code : " + ex.code + "message  : " + ex.getMessage());
            } catch (UncheckedExceptions e) {
                System.out.println("code : " + e.code + "message : " + e.getMessage());
            }
    }
        }



