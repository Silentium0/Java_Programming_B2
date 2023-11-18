package day36_inheritance.final_example;

public class Main {


    public static void main(String[] args) {


        new Parent().walk();
        new Child().walk();
    }


}
class Parent{
    public final void walk (){
        System.out.println("You are walking in Parent class");
    }

}
class Child extends  Parent{
//    public void walk (){  // you can no run , you have final method in Parent
//        System.out.println("You are walking in Child class");
//
//    }

}
