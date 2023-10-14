package day21_arrays;

public class SumElements {


    public static void main(String[] args) {

        int [] num = {3,5,7,8};
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
            sum += num[i];
        }
        System.out.println("3"+"+"+"5"+"+"+"7"+"+"+"8"+"= "+sum);
    }
}
