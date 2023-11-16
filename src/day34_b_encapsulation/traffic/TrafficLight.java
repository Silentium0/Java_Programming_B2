package day34_b_encapsulation.traffic;

public class TrafficLight {

    private String color;

    public TrafficLight(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void  setColor(String color){
        if (color.equals("black") || color.equals("pink") || color.equals("yellow")){
            this.color = color;
        }else {
            System.out.println("Invalid color");
        }


    }




}
