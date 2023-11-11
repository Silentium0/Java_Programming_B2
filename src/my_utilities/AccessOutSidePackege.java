package my_utilities;

import day33_b_encapsulation.access_modifier.AccessModifier;

public class AccessOutSidePackege {


    public static void main(String[] args) {



        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        //System.out.println(obj.b); //cant access
        //System.out.println(obj.c);//cant access

        System.out.println(AccessModifier.x);
        //System.out.println(AccessModifier.z);//cant access
       // System.out.println(AccessModifier.y);//cant access




    }

}
