package day33_a_static;

public class Iphone {


    String model;
    double price;
    static  String day;
    static String os;
    static boolean appday;


    static String  company = "QUAN-LEE";



    public Iphone(String model,double price){
        this.model = model;
        this.price = price;

    }

    static {
        company = "QUAN-LEE";
        day  ="Monday";
        os = "SOI";
        if (day.equals("Monday")){
            appday = true;
        }

    }


    @Override
    public String toString() {
        return "Iphone" +
                "\n\tModel: " + model+
                "\n\tPrice: " + price+
                "\n\tCompany: "+company; // we add a company here
    }
}
