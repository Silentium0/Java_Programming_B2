package day16_loops;

public class ReplaceMethod1 {

    public static void main(String[] args) {


        String s = " java is a language";
        System.out.println(s);

        s.replace('a', 'e'); // need to reassign
        s = s.replace('a', 'e');
        System.out.println(s);

        System.out.println("________________");

        String day = "Today is Wednesday we will learn java on Wednesday. it is Wednesday";
        System.out.println(day);
        day = day.replace("Wednesday","Thursday");
        System.out.println(day);






    }
}
