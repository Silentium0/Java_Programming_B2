package day21_arrays;

public class AverageNumber {


    public static void main(String[] args) {

        int[] arr = {45,3,76,234,987,2345,};

        int sum = 0;


        for (int each : arr){
            sum +=each;


        }
        System.out.println("Total: "+sum);
        System.out.println("Average: "+ sum/arr.length);




    }
}
