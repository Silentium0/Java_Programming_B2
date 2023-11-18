package day36_inheritance.access.b;

import day36_inheritance.access.a.First;

public class Third {


    public static void main(String[] args) {


        First obj = new First();

        System.out.println(obj.one);
      // System.out.println(obj.two); // it is Protected NO access  visible in different package if INHERITANCE
      // System.out.println(obj.three); // NO access it is  default,  able just in same package
      // System.out.println(obj.four); // private NO access
    }



}
