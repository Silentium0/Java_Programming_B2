package day15_string;

public class indexOfMethod2 {
    /*
    .charAt(index);
    .indexOf("")
    .indexOf('')
    .indexOf('', startIndex)
    .lastIndexOf("")
    .lastIndexOf('')
    .lastIndexOf('', startIndex)
    .substring(startIndex);
    .substring(startIndex, endIndex);

 */

    public static void main(String[] args) {


        String str = "definition";
         System.out.println("First i index " + str.indexOf("i"));
         System.out.println("First i index " + str.indexOf('i'));
        System.out.println("First i index " + str.lastIndexOf("i"));
        System.out.println("First i index " + str.lastIndexOf('i'));


        System.out.println("Second i index " + str.indexOf('i',4));

    }



}
