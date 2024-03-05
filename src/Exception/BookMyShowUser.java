package Exception;

public class BookMyShowUser {
 String userName;
 String passWord;
    public BookMyShowUser(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {

        return userName;
    }

    public String getPassWord() {

        return passWord;
    }
}
