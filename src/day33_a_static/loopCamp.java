package day33_a_static;

import day14_string.StartsAndEnds;

import java.util.Arrays;

public class loopCamp {


    String name;
    int groupNum;

    static String [] teacher;
    static  String schoolName;

    static  int batchNum;
    static {
        batchNum = 2;
        teacher = new String[]{"Nadir","Feyruz"};
        schoolName = "loopCamp";
        printinfo();
    }



    public loopCamp(String name, int groupNum) {

        this.name = name;
        this.groupNum = groupNum;
    }


    public static void  printinfo(){
        System.out.println("School info");
        System.out.println("\tSchool name: "+schoolName);
        System.out.println("\tBatch number:  "+batchNum);
        System.out.println("\tTeachers:  "+ Arrays.toString(teacher));
        System.out.println();
    }

    @Override
    public String toString() {
        return "loopCamp" +
                "\n\tName " + name +
                "\n\tGroup Number " + groupNum+
                "\n\tBatch number: "+batchNum;
    }
}
