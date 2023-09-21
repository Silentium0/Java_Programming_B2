package day05_variables;

public class CharExample {


    public static void main(String [] args){



        char letterOne = 'a';
        char letterTwo =  'Z';
        char numberOne =  '9';
        char specialOne =  '$';

        System.out.println( letterOne);
        System.out.println( letterTwo);
        System.out.println( numberOne);
        System.out.println( specialOne);

        System.out.println( specialOne + letterTwo + numberOne + specialOne); // just add all chat from ASCII

        System.out.println( letterOne+" "+letterTwo+" "+numberOne+" "+specialOne); // with concatenation


        System.out.println(letterOne + numberOne); // the numbers come up from chart ASCII  a->97 + 9->57 = 154

        System.out.println(letterOne+letterTwo+ " char: " + numberOne+specialOne); // after use  string "char is double quot"  everything will addition not mathematics

















    }
}
