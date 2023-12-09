package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Fourth extends First { // INHERITANCE

    public static void main(String[] args) {


        First obj = new First();
        System.out.println(obj.one);
//        System.out.println(obj.two);
//        System.out.println(obj.three);
//        System.out.println(obj.four);

        Fourth obj2 = new Fourth();

        System.out.println(obj2.one); //  extends First  // INHERITANCE
        System.out.println(obj2.two); // -> protected  got access after call ->  extends First  (INHERITANCE)
        //System.out.println(obj2.three); // NO access
        //System.out.println(obj2.four); // NO access




    }
}
