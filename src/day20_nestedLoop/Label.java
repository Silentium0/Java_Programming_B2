package day20_nestedLoop;

public class Label {


    public static void main(String[] args) {


        for (int i = 0; i < 3 ; i++) {
            System.out.println("I "+i);

            for (int j = 0; j < 2; j++) {

                if (j == 1){
                    break;
                }

                System.out.println("J "+j);

            }

            System.out.println();
        }
    }
}
