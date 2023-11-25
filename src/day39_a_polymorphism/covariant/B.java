package day39_a_polymorphism.covariant;

import java.util.ArrayList;

public class B extends A {




    public B test(){
        return new B();
    }


    public static void main(String[] args) {



        // we can store different objects  under same reference
        A []  arr = {new A(), new B()};
        A obj1 = new A();
        A obj2 = new B();

        ArrayList<A> list = new ArrayList<>();
        list.add(new A());
        list.add(new B());




    }





}
