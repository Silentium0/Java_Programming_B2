package day23_multidimensional_arrays;

public class AWS {


    public static void main(String[] args) {

        String zones = "us-east1, us-west1, us-south1, us-north1";
        String app = "Etsy";

        String [] zoness = zones.split(", ");

        for (String each : zoness ){
            System.out.println(app+"is deploying on "+ each);
        }

        System.out.println("___________FOR_I__LOOP____________________");


        for (int i = 0; i < zoness.length; i++) {
            System.out.println(app+"is deploying on "+zoness[i]);

        }



    }
}
