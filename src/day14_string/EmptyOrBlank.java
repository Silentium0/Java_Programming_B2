package day14_string;

public class EmptyOrBlank {
    public static void main(String[] args) {

        String str = "Last example";
        System.out.println(str.isEmpty());

        System.out.println("___________");

        str = "";
        System.out.println(str.isEmpty()); // we did reassign  str =  ""

        str = " ";
        System.out.println(str.isEmpty()); // we got here space so no empty

        System.out.println("_______________-");

        System.out.println(str.isBlank()); // str with blink " " true  not working with empty

        str = "        .          ";
        System.out.println(str.isBlank()); // we got   dot (.)  right on the middle
    }
}
