package day31_custom_class;

public class Carpet {


    double width;
    double length;
    boolean siEgyptinan;
    double price;

    double total;


    public Carpet(boolean fromEgipt, double inWidth, double inLeanght, double isPrice){
        siEgyptinan = fromEgipt;
        width = inWidth;
        length = inLeanght;
        price = isPrice;
        callcul();

    }

    public  void  callcul(){
        total = width * length * price;

        if (!siEgyptinan){
            total -=340;
        }
    }

    @Override
    public String toString() {
        return "Carpet" +
                "\nwidth " + width +
                "\nlength " + length +
                "\nEgyptian " + siEgyptinan +
                "\nprice per unit  " + price +
                "\ntotal " + total;
    }
}
