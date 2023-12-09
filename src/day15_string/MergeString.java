package day15_string;

public class MergeString {

    public static void main(String []args){


        String a = "demo";
        String b = "omen";

        String move = "";
        move += a.charAt(0);
        move += b.charAt(0);


        move += a.charAt(1);
        move += b.charAt(1);


        move += a.charAt(2);
        move += b.charAt(2);

        System.out.println(move);// takes char from  a  first char and then from  b  first char



    }


}
