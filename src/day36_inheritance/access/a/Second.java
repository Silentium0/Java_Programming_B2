package day36_inheritance.access.a;

public class Second  {

    public static void main(String[] args) {

        First obj = new First();

        System.out.println(obj.one);
        System.out.println(obj.two);
        System.out.println(obj.three);
      //  System.out.println(obj.four) // is private NO access, able  just in same class

        Second obj2 = new Second();

//        System.out.println(obj2.one);
//        System.out.println(obj2.two);
//        System.out.println(obj2.three);
//        System.out.println(obj2.four);





    }
}
