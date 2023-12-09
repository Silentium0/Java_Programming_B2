package day39_a_polymorphism.animal;

public class Wild {

    public static void main(String[] args) {

        Lizard lizard = new Lizard();
        lizard.eat();
        lizard.name = "spider";
        lizard.numOfClass = 200;
        lizard.skinColor = "camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numOfClass);
        System.out.println(lizard.skinColor);


        System.out.println();

        Reptile reptile = new Lizard(); // "Lizard is eating" // we call object one method
        reptile.eat();
        reptile.name = "reptile";
        reptile.numOfClass = 20;
        //reptile.skinColor = // no access
        System.out.println(reptile.name);
        System.out.println(reptile.numOfClass);

        System.out.println();

        Animal animal  = new Lizard(); // "Lizard is eating" // we call object one method
        animal.eat();
        animal.name = "Animal";
        System.out.println(animal.name);
        //animal.akincolor = // no access
        //animal.numOfclass = // No access


        System.out.println("___________");

        Reptile reptile2 = new Reptile(); // we call object one method
        reptile2.eat();



        Animal animal1 = new Reptile();// we call object one method witch is Reptile
        animal1.eat();






    }
}
