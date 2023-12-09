package day24_methods;

import java.util.Arrays;

public class Groups {

    public static void main (String[] args) {

        String [][] groups = new String[4][];
        String [][] groups2 = new String[4][3];

        System.out.println(Arrays.deepToString(groups));


        String [] group1 = {"java","api","home"};

        groups[0] = group1;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("____Group_2__________");
        String []  group2 = {"mother", "father","sister"};
        groups[1] = group2;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("___Group_3_____");
        String [] group3 = {"tesla","amazon"};
        groups[2] = group3;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("____Group__4");
        String [] group4 = {"apple"};
        groups[3] = group4;
        System.out.println(Arrays.deepToString(groups));

        System.out.println("______________________");

        for (String [] eachElement : groups){
            System.out.println(Arrays.toString(eachElement));
        }
        System.out.println("___FOR_I____LOOP__OPTION_______");
        for (int i = 0; i < groups.length; i++) {
            System.out.println(Arrays.toString(groups[i]));
        }
        System.out.println("__________________________");
        for (String [] eachArray : groups){
            for (String eachName : eachArray){
                System.out.println(eachName);
            }
        }
    }
}
