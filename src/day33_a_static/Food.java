package day33_a_static;

public class Food {


    String name;
    int quantity;
    double unitPrice;
    double totalPrice;


    public Food(String name){
        this.name = name;
        culculate();
    }
    public  Food (String name, int quantity){
        this(name);
        this.quantity = quantity;
        culculate();
    }
    public  Food (String name, int quantity,double unitPrice){
        this(name,quantity);
        this.unitPrice = unitPrice;
        culculate();
    }

    public void culculate(){
        totalPrice = unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Food" +
                "\n\tName: " + name +
                "\n\tQuantity: " + quantity +
                "\n\tUnit Price: " + unitPrice +
                "\n\tTotal Price: $" + totalPrice ;
    }
}
