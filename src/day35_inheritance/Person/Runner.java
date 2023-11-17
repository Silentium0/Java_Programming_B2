package day35_inheritance.Person;

public class Runner {

    public static void main(String[] args) {


        Person info = new Person();
        info.age = 23;
        info.favoriteHobby = "Scuba";
        info.name = "Sergii";
        System.out.println(info);
        info.talk();






        Student info1 = new Student();
        info1.age = 35;
        info1.favoriteHobby = "Java";
        info1.name = "Toma";
        System.out.println(info1);
        info1.talk();
        info1.studying();





    }


}
