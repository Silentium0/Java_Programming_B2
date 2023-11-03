package day29_arraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {


    public static void main(String[] args) {

        ArrayList<Integer> oroginal = new ArrayList<>(Arrays.asList(3,6,14,92,3,5));

        ArrayList<Integer> nums = new ArrayList<>(oroginal);

        nums.removeIf(each -> each % 2==0); // even
        System.out.println(nums);



//        for (Integer each : nums){
//            System.out.println(each);
//
//
//        }





    }
}
