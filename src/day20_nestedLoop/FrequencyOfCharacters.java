package day20_nestedLoop;

public class FrequencyOfCharacters {


    public static void main(String [] args){

        String str = "double";
        String unique = "";



        for (int i = 0; i < str.length() ; i++) {
            int coutn = 0;

            char eachLetter = str.charAt(i);

            if (!unique.contains("" + eachLetter)) {

                for (int j = 0; j < str.length(); j++) {

                    if (eachLetter == str.charAt(j)){

                        coutn++;


                    }



                }
                System.out.println(eachLetter + "-  " + coutn);
                unique += eachLetter;
            }
        }

    }
}
