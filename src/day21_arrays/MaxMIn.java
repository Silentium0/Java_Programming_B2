package day21_arrays;

public class MaxMIn {

    public static void main(String[] args) {


        int [] nums = {34,67,234,698,89};

        int max = nums[0];
        int min = nums [0];


        for (int i = 0; i < nums.length; i++) {
            int eachNum = nums[i];

            if (eachNum < min){
                min = eachNum;
            } else if (eachNum > max) {
                max = eachNum;
            }


        }
        System.out.println("MIN: "+min);
        System.out.println("MAX: "+max);
    }
}
