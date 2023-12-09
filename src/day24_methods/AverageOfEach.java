package day24_methods;

public class AverageOfEach {

    public static void main(String[] args) {

        int [][] num = {
                {12,54,2,7,34},
                {3,56,4},
                {12,56,14}
        };
        System.out.println(num.length); // numbers of Arrays
        System.out.println(num[2].length); // number of elements

        int  sum = 0;
        int totalLength = 0;
        for (int [] eachArray : num){

            for (int eachnum : eachArray){
                sum += eachnum;
            }
            totalLength += eachArray.length;

            System.out.println("total: "+sum);
            System.out.println("Average of  Array: "+ (sum / totalLength));

        }

        System.out.println("Total sum: "+sum);
        int average = sum/totalLength;

        System.out.println("Average: "+ (sum/totalLength));
        System.out.println("Average: "+ average);



    }
}
