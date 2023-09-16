package day07_relational_operators;

public class OperatorPractice4 {


    public static void main(String[] args) {


//        int t = 100;
//
//            //  =  -101 * -101 / 100   100  ---> 10201 / 100 + 100 = 202
//        int p =  - ++t * -t-- / t++ + --t;
//
//         System.out.println(t);
//        System.out.println(p);



        int M = 300;
        int N = 400;
         //     301   400   300       400
        int U = ++M + N++ - M-- % 2 + --N %2;

        System.out.println(U);










    }
}
