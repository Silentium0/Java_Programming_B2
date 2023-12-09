package day39_b_exception.learn;

public class FirstTry {


    public static void main(String[] args) {

        System.out.println("First line");

        try{
            String word = "Java";
            System.out.println(word.charAt(6));

        }catch (Exception e){
            System.out.println("Exception happened error come back check");
            e.printStackTrace();
        }
        System.out.println("Last line");







    }
}
