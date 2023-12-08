package day44_map_and_functions.string_builder_buffer;

public class StringBuilderStringBuffer {

    public static void main(String[] args) {



        String str1 = "Loopcamp";
        String str2 =  new String("Loopcamp");
        str1 = str1 + "course"; //       IMMUTABLE we can not change here we made a new one

        //NOT Synchronize
        StringBuilder str3 = new StringBuilder("Loopcamp"); // Stored in Heap
        str3.append(" course");
        System.out.println(str3);

        //is Synchronize
        StringBuffer str4 = new StringBuffer("Loopcamp");
        str4.reverse();
        System.out.println(str4);







    }
}
