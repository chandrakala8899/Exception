package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;

public class FileNotException {
    public static void main(String[] args) {
        try {
            Date currentdate = new Date();
            System.out.println("");
            Calendar furture = Calendar.getInstance();
            furture.add(Calendar.MINUTE, 1);
            Date futureDate = furture.getTime();


            boolean continueloop = true;
            while (continueloop) {
                try {
                    FileInputStream fileInputStream = new FileInputStream("D:\\whileloop\\ch.txt");
                    System.out.println("file found");

                    continueloop = false;

                } catch (FileNotFoundException e) {
                    currentdate = new Date();
                    if (currentdate.before(futureDate)) {
                        continueloop = true;

                    } else {
                        continueloop = false;
                    } System.out.println(" error occured Exception  " + e.getMessage());
                }
            }
        } catch (Exception e) {
            e.getStackTrace();

        }
    }
}



