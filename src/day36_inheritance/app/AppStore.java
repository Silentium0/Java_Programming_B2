package day36_inheritance.app;

public class AppStore {

    public static void main(String[] args) {


        Instagram object = new Instagram(3.5);
        object.download();
        object.follow();
        System.out.println(object.name);



        YouTube object1 = new YouTube(4.6);
        object1.download();
        object1.subscribe();


        System.out.println(object1.name);





    }







}
