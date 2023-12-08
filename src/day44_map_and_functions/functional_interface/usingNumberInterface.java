package day44_map_and_functions.functional_interface;

public class usingNumberInterface  {



    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n) -> {

            if (n % 2 == 0){
                System.out.println(n+ ": is even");
            }else {
                System.out.println(n+": is Odd");
            }
        };

        evenOrOdd.apply(23);
        evenOrOdd.apply(22);






    }


}
