package day19_nested_loops;

public class CountJava {

    public static void main ( String [] args){


        String str = "java is a language java java"; // 23

        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            String everyFour = str.substring(i, i+ 4);

            if (everyFour.equals("java")){
                count++;
            }

        }
        System.out.println("you  have "+count+" java words");




    }
}
