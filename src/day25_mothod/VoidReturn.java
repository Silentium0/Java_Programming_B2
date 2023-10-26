package day25_mothod;

public class VoidReturn {

    public static void hello() {
        System.out.println("Hello");


    }
    public static String bye(){
        return "Buy";  //  it works just with String


    }

    public static void main(String[] args) {
        hello();
        bye();
        System.out.println(bye());
        String str = bye();
        System.out.println(str);




    }
}
