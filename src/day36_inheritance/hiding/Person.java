package day36_inheritance.hiding;

public class Person {

    String name = "Lulu";

}


class Child extends Person{


    //String  name = "Sofia";

}

class Runner {

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);

        Child info = new Child();
        System.out.println(info.name);







    }
}

