package day21_arrays;

public class ForEachexample {


    public static void main(String[] args) {

        int [] nums = {12,5,334,56};

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }

        for (int each : nums ) {
            System.out.println("Another example " +each);
            if (each == 334){
                break;

            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 2){
                nums[i] = 34;
            }

        }
        System.out.println("____________________________");

        String [] str = {"name", "project", "java", "loop"};

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);

        }
        System.out.println("_______________________");

        int [] num = {1,45,32,56,78,};

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);

        }
    }
}
