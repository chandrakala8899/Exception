package practice;

public class PracticalException {
    public static void main(String[] args) {
        String name = null;
        String companyName = "NEOTERIC";
        try {
            System.out.println(name.toUpperCase());
        }catch (Exception e){
            e.getStackTrace();
            System.out.println("error occured = "+e.getMessage());
//            throw new RuntimeException(e);

        }finally {
            System.out.println("from finally");
        }
        System.out.println(companyName.toUpperCase());

    }
}
