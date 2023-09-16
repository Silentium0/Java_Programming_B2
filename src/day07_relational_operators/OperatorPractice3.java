package day07_relational_operators;

public class OperatorPractice3 {


    public static void main(String[] args) {


        int h = 5;

        int p = h;
        h++;

        System.out.println(h); // 6
        System.out.println(p); // 5

        int k = h++;
        System.out.println(h); // 7
        System.out.println(k);// 6


    }
}
