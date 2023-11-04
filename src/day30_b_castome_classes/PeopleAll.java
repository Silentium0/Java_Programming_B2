package day30_b_castome_classes;

public class PeopleAll {

    public static void main(String[] args) {

        Person person = new Person(); // we created object of person class
        Person person2 = new Person();

        System.out.println(person.name); // Sergii
        person.name = "Toma"; // reassign
        System.out.println(person.name); // Toma



        person.age = 23;
        person.height = 5.3;
        person.isMarried = false;
        person.name = "Andrii";

        System.out.println("Person name is: "+person.name);
        System.out.println("Person age is: "+person.age);
        System.out.println("Person height is: "+person.height);
        System.out.println("Person is  married: "+person.isMarried);

        System.out.println("_______________________________");

        person2.age = 30;
        person2.height = 4.3;
        person2.isMarried = true;
        person2.name = "Toma";

        System.out.println("Person2 name is: "+person2.name);
        System.out.println("Person2 age is: "+person2.age);
        System.out.println("Person2 height is: "+person2.height);
        System.out.println("Person2 is  married: "+person2.isMarried);

    }

}
