package day30_b_castome_classes;

public class AppUsing {

    public static void main(String[] args) {



        App appOne = new App();
        appOne.isfree = false;
        appOne.version = 12.0;
        appOne.name = "EtherWall";

        System.out.println("Name of the App: "+appOne.name);
        System.out.println("Version of app: "+appOne.version);
        System.out.println("Is free: "+appOne.isfree);

        System.out.println("_________________");
        appOne.run();

        System.out.println("_____New___Object___No___Value________-");
        App appTwo = new App();

        appTwo.version = 13.0;
        appTwo.update();
        System.out.println("Version of app: "+appTwo.version);

        System.out.println("____New__Object__New__value__");

        new App().run(); // is new Object  have no value
        System.out.println(new App().name);






    }
}
