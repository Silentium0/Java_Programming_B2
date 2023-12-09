package day25_mothod;

public class MethodWithOthers {

    public static String dayinWords(int day) {

        switch (day) {
            case 1:
                return "monday";
            case 2:
                return "tusday";
            case 3:
                return "thursday";
            case 4:
                return "friday";
            case 5:
                return "saturday";
            case 6:
                return "sunday";
            default:
                return "invalid input";


        }
    }

    public static void main(String[] args) {
        System.out.println(dayinWords(5));


    }


}
