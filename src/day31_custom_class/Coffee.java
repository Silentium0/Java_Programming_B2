package day31_custom_class;


 /*

        Create a coffee class with these instance variables:
             price, size(oz), brand, types

             ex types: black, cappuccino, latte, mocchiato....

        instance methods:

            - make a toString to print all the information of the coffee objects

            - drink(): print: drinking $type of coffee

            - refill(amount in oz): print refilling x oz
                add the number of oz to the total size

     */

public class Coffee {

    double price;
    double size;
    String brand;
    String type;

    @Override
    public String toString() {
        return "Coffee from: " + type +
                "\nPrice: $" + price +
                "\nSize: " + size + "oz" +
                "\nBrand: " + brand;

    }

    public void drink() {
        System.out.println("Drink "+type+" of coffee");
        size -=2;

    }

    public void refeel(double oz) {

        if (size+ oz <= 8){
            System.out.println("Refilling "+oz+ " oz coffee");
            size +=oz;
        }else {
            System.out.println("You own money to company plus % from sell , order over 8 oz");
        }




    }









}