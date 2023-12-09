package day37_a_bstraction.exercise;

public class Running extends Exercise {


    public Running(){
        super("Running");
    }
    public void doExercise (){
        System.out.println("Running on treadmill");
    }
     @Override
    public  void generalInfo(){
        System.out.println(name+" make you better");
    }

}
