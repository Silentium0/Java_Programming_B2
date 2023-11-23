package day38_a_abstraction_interface.shopping;

public class Amazon extends OnlineShopping{

    @Override
    public void buyItem() {
        System.out.println("Buy from Amazon");
    }

    @Override
    public void returnItem() {
        System.out.println("Return items");
    }


    @Override
    public void payForShipping(boolean b) {
        System.out.println(b ? "Pay for shopping": "Free shipping");
    }

    @Override
    public void viewCart() {
        System.out.println("View Amazon cart");
    }
}
