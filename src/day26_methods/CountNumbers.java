package day26_methods;

public class CountNumbers {


    public static void count (int num ) { // 1+2+3+4+5........

        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;

        }
        System.out.println("Total is: "+sum);

    }

    public static int getsum(int numbers) {
        int sum = 0;
        for (int i = 0; i <= numbers; i++) {
            sum += i;

        }
        return sum;

    }

    public static void main(String[] args) {
        count(5);
        count(10);
        count(76);
        System.out.println();
        System.out.println(getsum(5));
        System.out.println(getsum(5)+5);
        System.out.println(getsum(20)+5);



    }



}
