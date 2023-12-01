package day41_collection.recap_try_catch;

import java.util.ArrayList;

public class RecapTryCatch {


    public static void main(String[] args) {


        ArrayList <String> list  = new ArrayList<>();
        list.add("Hello"); // index 0
        list.add("bye"); // index 1


        try{
            System.out.println(list.get(2));
            String str  = null;
            str = str.toLowerCase();
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
            System.out.println("Index out of bound");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();
            System.out.println("No Object");
        }

        System.out.println(list);

        System.out.println("Start");


        try{
            Thread.sleep(2000); //
        }catch (InterruptedException | IllegalArgumentException e) {
            System.out.println("We are  handel compile time");
        }
        System.out.println("End");



    }
}
