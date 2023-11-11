package day33_a_static;

public class BestBuy2 {

    public static void main(String[] args) {

        BestBuy inf1 = new BestBuy("Portland");
        BestBuy inf2 = new BestBuy("Tampa");
        BestBuy inf3 = new BestBuy("Miami");

        System.out.println(inf1.location);
        System.out.println(inf2.location);
        System.out.println(inf3.location);

        System.out.println("___________");

        System.out.println("Head Quater: "+inf1.headQuarter);
        System.out.println("Head Quater: "+inf2.headQuarter);
        System.out.println("Head Quater: "+inf3.headQuarter);

        System.out.println(inf3.headQuarter);
        System.out.println(BestBuy.headQuarter);

        System.out.println("__________________");



        inf1.headQuarter = "Taxas US"; // we reassign to all objects
        System.out.println("HeadQuater: "+inf1.headQuarter);
        System.out.println("HeadQuater: "+inf2.headQuarter);
        System.out.println("HeadQuater: "+inf3.headQuarter);

        System.out.println(inf3.headQuarter);
        System.out.println(BestBuy.headQuarter);

        System.out.println("___________________");

        System.out.println(inf1.day);
        System.out.println(BestBuy.day);

        inf1.day= "Weekday";
        System.out.println(inf1.day);
        System.out.println(BestBuy.day);

        System.out.println("_______________");

        inf1.openStore();
        inf2.openStore();
        inf3.openStore();







    }
}
