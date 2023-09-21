package day10_if_statements;

public class CheckCharacter {


    public static void main(String[] args) {


        char latter = 'a';


        if ('A'<= latter && latter <='Z'){
            System.out.println("UPPERCASE");
        }

        if ('a' <= latter && latter <= 'z'){
            System.out.println("lowercase");
        }
    }


}
