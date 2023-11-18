package day36_inheritance.final_example;

public class UseFinalExample   {


    public static void main(String[] args) {

        FinalExam info = new FinalExam();
        System.out.println(info.a);
        // info.a = 12; //  if you provide final  before data type
        // value  will be not changeable
        System.out.println(info.a);

        System.out.println("_________________");

        FinalExam info1 = new FinalExam(30);
        System.out.println(info1.a);
        System.out.println(info1.b);


        System.out.println(FinalExam.planet);
        //  FinalExam.planet = "Mars"; // we have final so you can not to  change value
        System.out.println(FinalExam.planet);







    }




}
