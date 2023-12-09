package day44_map_and_functions.functional_interface;

public class UsingDynamicInterface {


    public static void main(String[] args) {

        DynamicInterface <String> printEachChar = (str) -> {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));

            }
        };
        printEachChar.test("loop");

        System.out.println("___________");


        DynamicInterface <Integer> printEachNum = (num) -> {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        };
        printEachNum.test(5);












        }
}
