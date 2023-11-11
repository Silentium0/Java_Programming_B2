package day33_b_encapsulation.access_modifier;

public class AccessInPackage {

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
       // System.out.println(obj.c); // private no access


        System.out.println(AccessModifier.x);
       // System.out.println(AccessModifier.z); // privet not access
        System.out.println(AccessModifier.y);



    }
}
