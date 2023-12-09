package day16_loops;

public class MiddleChar {

    public static void main(String[] args) {


        String str = "wefweft";
        //            0123456
        int  mid = str.length() / 2;

        if (str.length() % 2 == 0){ //
            char firstMiddleChar = str.charAt(mid - 1);
            char secondMiddleChar = str.charAt(mid);
            System.out.println(" Middle char "+ firstMiddleChar + secondMiddleChar);
        }else {
            char middle = str.charAt(mid);
            System.out.println("Middle char: "+ middle);
            System.out.println("Middle char with substring: "+ str.substring(mid, mid +1));
        }


    }
}
