package day14_string;

public class Contains {
    public static void main(String[] args) {

        String day = "Today i was playing  Yasuo";

        System.out.println(day.contains("i was"));
        System.out.println(day.contains("iwas"));

        System.out.println("________________________");


        String str = "I will gonnaplay";
        System.out.println(day.contains(str)); // day
        System.out.println(str.contains(str)); // str here

        System.out.println(day.contains("You need to quit play"));// not "Today i was playing  Yasuo"; different name in string
        System.out.println(day.contains("I will gonnaplay")); // its contain day not str ---> false


        if (day.contains("yasuo")){
            System.out.println("yes it is contain that word");
        }else {
            System.out.println("invalid  you need to use UpperCase  (Y) in boolean ");
        }


    }
}
