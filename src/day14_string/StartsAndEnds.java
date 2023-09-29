package day14_string;

public class StartsAndEnds {

    public static void main(String[] args) {

        String str = "Lee sin";
        System.out.println(str.startsWith("Lee sin"));
        System.out.println(str.startsWith("lee sin"));

        System.out.println("___________________________");

        System.out.println(str.startsWith(str));

        System.out.println("______________");

        System.out.println(str.startsWith("   Lee sin")); // we got space here----> so will be false
        System.out.println(str.startsWith(                 "Lee sin")); // no space on double quot

        System.out.println("____________________");

        String sentence = "do you like to play Alistar";
        System.out.println(sentence.startsWith("play Alistar")); // STARTS
        System.out.println(sentence.endsWith("play Alistar")); // ENDS
        System.out.println(sentence.startsWith("do you")); // STARTS


    }
}
