package day38_a_abstraction_interface.shopping;

public class Runner {

    public static void main(String[] args) {

        Target info = new Target();
        info.price = 12;
        info.buyItem();
        info.returnItem();
        System.out.println("Price: "+info.price);

        System.out.println();


        Amazon info2 = new Amazon();
        info2.price = 340;
        System.out.println("Price: "+info2.price);
        info2.buyItem();
        info2.viewCart();
        info2.payForShipping(true);
        info2.returnItem();


    }
}
