package day39_a_polymorphism.clothes;

public class Store {

    public static void main(String[] args) {


        Tshirt tshirt = new Tshirt();
        tshirt.wear();


        Clothes newTShort = new Tshirt();
        newTShort.wear();


        Object tShirt =  new Tshirt();
       // tShirt.wear();    NO reference  to the wear.() method


        //HasHood tsshort=  new Tshirt();// does not implements HasHood interface to Tshirt

        System.out.println();

        Jacket jacket = new Jacket();
        jacket.putHood();
        jacket.wear();

        System.out.println();

        HasHood jaket = new Jacket();
        jaket.putHood();




        buy(tshirt); // static   just  call static
        buy(jacket);
        buy(new Tshirt());
        buy(new Jacket());



    }



    public static void buy(Clothes clothes){   // static

        if (clothes instanceof Tshirt){
            System.out.println("Bought T-shirt");
        } else if (clothes instanceof  Jacket) {
            System.out.println("Bought Jacket");
        }

    }

















}
