package day08_scanner_logical_operators;

public class GoForWalk {


    public static void main(String[] args) {

         /*
        Task: Want to go for a walk

            if it is not raining
            if temp is above 70

     */

            boolean isRaining = false;
            int temp = 60;

            //boolean result = we can do all of this  in print statement.

            System.out.println("Do I need to go for a walk: " + (!isRaining && temp > 70) );
    }
}
