package day42_maps.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UsingIterator {


    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Sergii");
        list.add("Toma");
        list.add("Taras");
        list.add("Alina");
        list.add("Zahib");
        list.add("Murat");
        list.add("Alecsander");

        System.out.println(list);

        Iterator<String>iterate = list.iterator();
        System.out.println(iterate.next());
        System.out.println(iterate.next());
        System.out.println(iterate.next());
        System.out.println(iterate.next()); // Alina

        System.out.println("__________LOOP___________");

        while (iterate.hasNext()){
            System.out.println(iterate.next()); // Start after Alina




    }


    }
}
