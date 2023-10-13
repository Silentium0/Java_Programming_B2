package day20_nestedLoop;

public class UniqueCharacter {

    public static void main(String[] args) {

        String str = "aabxxdeef"; // bdf  our unique , they single  in a string
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);
            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                char eachInnerLetter = str.charAt(j);

                if (eachInnerLetter == eachLetter) {
                    count++;
                }

            }
            if (count == 1) {
                unique += ("" + eachLetter);
            }

        }
        System.out.println(unique);
    }
}
