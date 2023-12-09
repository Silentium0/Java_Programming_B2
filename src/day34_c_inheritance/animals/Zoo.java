package day34_c_inheritance.animals;

public class Zoo {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.species = "Generic Animal";
        animal.numOfLeg = 5;
        animal.walk();


        Dog dog = new Dog();
        dog.species = "Golden Retriever";
        dog.numOfLeg = 4;
        dog.walk();
        dog.bark();



       Lion lion = new Lion();
        lion.species = "White lion";
        lion.numOfLeg = 4;
        lion.walk();
        lion.roar();



    }
}
