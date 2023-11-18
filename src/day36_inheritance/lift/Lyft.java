package day36_inheritance.lift;

import java.security.PublicKey;

public class Lyft {

    String driver;

    public Lyft(String driverName){
        this.driver = driverName;

    }

    public  double calculateRate(int miles){
        return miles * 1.50;
    }


}
