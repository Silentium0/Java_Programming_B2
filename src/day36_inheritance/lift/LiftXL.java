package day36_inheritance.lift;

public class LiftXL extends Lyft {

    public LiftXL(String driverName){
        super(driverName);
    }
//    @Override
//    public double calculateRate(int miles){
//        return miles * 2.50;
//    }

    public double calculateRate(int miles){
        return super.calculateRate(miles) * 1.70 ;
    }


}
