package day33_a_static;

public class BestBuy {

    String location;
    static  String headQuarter = "Orlando US";
    static  String day = "Monday";

    public BestBuy(String location) {
        this.location = location;
    }


    public void openStore(){
        System.out.println("Opening in: "+ location);
        System.out.println("Headquarter in:  "+ headQuarter);
    }




}
