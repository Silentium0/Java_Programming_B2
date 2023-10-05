package day16_loops;

public class PrintNumbers {

    public static void main(String[] args) {


        int num = 2;
        while (num <=100){
            System.out.println(num);
            num +=2; // will print just  even numbers  22 24 26
        }

        System.out.println("________________");
        int i = 1;
        while (1 <= 100){
            if (i % 2 == 0) {
                System.out.println("Even: "+i);
            }
            i++;
        }




    }
}
