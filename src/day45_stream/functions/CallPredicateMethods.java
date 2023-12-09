package day45_stream.functions;

public class CallPredicateMethods {

    public static void main(String[] args) {

        boolean result = UsePredicate.isPalindrome.test("hello");
        System.out.println(result);
        boolean result2 = UsePredicate.isPalindrome.test("anna");
        System.out.println(result2);

        System.out.println("___PRIME_____");
        System.out.println(UsePredicate.isPrime.test(5));
        System.out.println(UsePredicate.isPrime.test(6));



    }
}
