package day35_inheritance.Person;

public class Person {


    String name;
    int age;
    String favoriteHobby;

    public void talk(){
        System.out.println("\t"+name+" is talking");
    }

    @Override
    public String toString() {
        return "Person" +
                "\n\tName: " + name +
                "\n\tAge: " + age +
                "\n\tFavorite Hobby: " + favoriteHobby;
    }
}
