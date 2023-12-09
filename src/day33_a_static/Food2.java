package day33_a_static;

import java.util.ArrayList;
import java.util.Arrays;

public class Food2 {


    public static void main(String[] args) {

        Food info1 = new Food("Apple");
        Food info2 = new Food("Grapes");
        System.out.println(info1);
        System.out.println(info2);
        Food info3 = new Food("Banana",6,0.99);
        Food info4 = new Food("Lemon",8,2.99);
        Food info5 = new Food("Orange",7,4.99);

        ArrayList<Food> foodList = new ArrayList<>(Arrays.asList(info1,info2,info3,info4,info5));
        System.out.println(foodList);
        for (Food each: foodList){
            if (each.quantity > 5){
                System.out.println(each);

            }
        }

    }
}
