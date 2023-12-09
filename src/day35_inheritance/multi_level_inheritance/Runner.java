package day35_inheritance.multi_level_inheritance;

public class Runner {

    public static void main(String[] args) {
        A object = new A();
        object.a = 2;
        object.b = 3;

        B objec2 = new B();
        objec2.c = 4;
        objec2.d = 5;
        objec2.a = 6;
        objec2.b = 7;



        C object3 = new C();
        object3.c = 4;
        object3.d = 5;
        object3.a = 6;
        object3.b = 7;
        object3.f = 8;
        object3.e = 9;


    }
}
