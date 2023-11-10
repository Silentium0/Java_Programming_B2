package day32_custom_classes;

public class Chain {


    public  Chain (){ // name have to be the same as ---- public class Chain--------
        System.out.println("One");
    }

    public Chain(int a,String strr){
        this();
        System.out.println("123456789");


    }

    public  Chain (String str){ // <--operators
        this(5000,"noob"); // can be any volume as long second constructor int
        System.out.println("number");
    }

    public  Chain( double df, int we){
        this("number" );
        System.out.println("call all 3 constructors");


    }




}
