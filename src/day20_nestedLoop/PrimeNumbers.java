package day20_nestedLoop;

public class PrimeNumbers {


    public static void main(String[] args) {

        int num = 50;
        String result = "";


        for (int i = 1; i <= num; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }

            }
            if (count == 2) {
                result += (i+ ",");

            }
        }
        result = result.substring(0,result.length()-1);  // we use this way to get rid if , comma at the  end of 47,
        System.out.println(result);

    }
}
