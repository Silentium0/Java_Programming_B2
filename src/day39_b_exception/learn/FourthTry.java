package day39_b_exception.learn;

public class FourthTry {

    public static void main(String[] args) {

        try {
            System.out.println("star");
            Thread.sleep(-2000);
            System.out.println("finish");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }









    }
}
