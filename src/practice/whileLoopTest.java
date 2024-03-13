package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class whileLoopTest {
    public static void main(String[] args) {
        boolean fileOpned = false;
        while (!fileOpned) {
            try {
                FileInputStream fileInputStream = new FileInputStream("D:\\whileloop\\helo.txt");
                fileOpned = true;
            } catch (FileNotFoundException e) {
                String fileRead = UUID.randomUUID().toString();
                Calendar fileReadExpiryTime = Calendar.getInstance();
                fileReadExpiryTime.add(Calendar.MINUTE, 1);
                System.out.println("file Expire Time "  + fileReadExpiryTime.getTime());
                Date fileReadExpiry = fileReadExpiryTime.getTime();
            } finally {
                System.out.println("from final block");
            }
        }
    }
}

