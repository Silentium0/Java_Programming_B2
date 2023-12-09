package day27_wrapper_arrays;

public class Count_Characters {


    public static void main(String[] args) {

        String s = "dBdK45hi%b2#d";
        int upperCount = 0;
        int lowerCase = 0;
        int digit = 0;
        int other = 0;

        for (int i = 0; i < s.length(); i++) {
           char eachLetter =  s.charAt(i);
           if (Character.isUpperCase(eachLetter)){
               upperCount++;
           }else if (Character.isLowerCase(eachLetter)){
               lowerCase++;
           } else if (Character.isDigit(eachLetter)) {
               digit++;
           }else {
               other++;
           }

        }
        System.out.println(upperCount);
        System.out.println(lowerCase);
        System.out.println(digit);
        System.out.println(other);

    }
}
