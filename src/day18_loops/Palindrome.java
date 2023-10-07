package day18_loops;

public class Palindrome {


    public static void main(String[] args) {


        String  original = "anna";
        //                  0123  we add  - minus  at front of length
        String reversed = ""; // make it like avaj

        for (int i = original.length() - 1  ; i >=0 ; i--) {
            reversed +=  original.charAt(i); // or you can use original = original.
        }

        System.out.println(reversed);
        System.out.println(original);

        if (original.equals(reversed)){
            System.out.println("It is palindrome ");
        } else {
            System.out.println(" not palindrome");

        }
    }
}
