package day38_a_abstraction_interface.language;

public class Translator {


    public static void main(String[] args) {

        Spanish info = new Spanish();
        info.hi();
        info.bye();



        Azerbaijani info2 = new Azerbaijani();
        info2.bye();
        info2.bye();

        System.out.println(Language.PLANET); // we can reach  to interface by  variable PLANET




    }
}
