package day34_b_encapsulation.traffic;

public class Road {

    public static void main(String[] args) {

        TrafficLight light = new TrafficLight("green");
        //light.color = "red"; //  do not have access . Private

        TrafficLight light1 = new TrafficLight("Red");
        System.out.println(light1.getColor());



        light1.setColor("black");
        light.setColor("pink");
        System.out.println(light1.getColor());
        System.out.println(light.getColor());



    }
}
