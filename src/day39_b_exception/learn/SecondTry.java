package day39_b_exception.learn;

public class SecondTry {


    public static void main(String[] args) {



        try{
            String s = "java";
           // s = null;
            System.out.println(s.length());

            int num [] ={12,32,5,667,8};
            System.out.println(num[7]);

        }catch (NullPointerException e){
            System.out.println("Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Arrays Exception");
        }



    }
}
