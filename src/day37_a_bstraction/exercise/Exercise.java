package day37_a_bstraction.exercise;

public abstract class Exercise {

    String name;

    public Exercise(String name){
        this.name = name;

    }

    public abstract void doExercise ();



    public  void generalInfo(){
        System.out.println("Exercise make you better");
    }


}
