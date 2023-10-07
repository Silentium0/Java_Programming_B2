package day18_loops;

public class CharactersAsNumbers {


    /*
            Characters in String
                Given a String print the ascii value codes for each character
                Ex:
                Input:
                java
                Output:
                106 97 118 97
 */



    public static void main(String [] args){


        String str = "Sergii";
//                    012345  we use lenght
        for (int i = 0; i < str.length(); i++) {
            System.out.println((int)str.charAt(i) + " "); // if you want numbers use just i

        }



    }
}
