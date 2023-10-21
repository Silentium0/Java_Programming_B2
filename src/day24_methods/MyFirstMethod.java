package day24_methods;

public class MyFirstMethod {



    public static void helloWorld () {
        System.out.println("Hello World");
    }

    public  static  void helloWorlds (){
        for (int i = 0; i <  50; i++) {
            System.out.println("I love java");
            helloWorld();
        }
    }
    public static void main(String[] args) {
       helloWorld();
       helloWorlds();


    }
}
