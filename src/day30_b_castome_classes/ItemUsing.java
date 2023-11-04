package day30_b_castome_classes;

public class ItemUsing {

    public static void main(String[] args) {

        Item item1 = new Item();
//  class name -> object->

        item1.name = "Apple";
        item1.price = 2.30;
        System.out.println(item1);

        System.out.println("______________________");

        Item item2 = new Item();
        item2.price = 4.5;
        item2.name = "Water";
        System.out.println(item2);




    }


}
