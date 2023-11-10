package day32_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferArray {


    public static void main(String[] args) {

        Offer info = new Offer("NASA","Florida",13000.00,false, 123);

        ArrayList<Offer> info1 = new ArrayList<>();
        info1.add(info);
        System.out.println(info1);

        System.out.println("_____________");

        for (Offer each : info1){
            System.out.println(each);
        }

    }
}
