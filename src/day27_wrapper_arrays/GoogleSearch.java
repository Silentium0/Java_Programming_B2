package day27_wrapper_arrays;

public class GoogleSearch {


    public static void main(String[] args) {

        String result = "About 11,910,000,000 results (0.48 seconds)";
        String [] resultArr = result.split(" ");

        String strNum = resultArr[1].replace(",","");
        String  strNum1 = resultArr[3].substring(1); // we add 1 to  delete ( braces

        System.out.println(strNum);
        System.out.println(strNum1);

        long resultNum = Long.parseLong(strNum);
        double resultNum1 = Double.parseDouble(strNum1);

        if (resultNum > 0 ){
            System.out.println("Test Passed");
        }
        if (resultNum1 >= 0 && resultNum1 <= 1){
            System.out.println("Test Passed");

        }

    }
}
