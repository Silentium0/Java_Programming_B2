package day20_nestedLoop;

public class FizzBuzz {


    public static void main(String[] args) {


        int num = 15;

        for (int i = 0; i <= num ; i++) {
            String result = "";

            if ( i % 3 == 0){
                result += "fin";
            }

            if (i % 5 == 0){
                result += "buzz";
            }
            System.out.println(result.isEmpty() ? i : result);


        }
    }
}



