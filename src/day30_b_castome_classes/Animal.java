package day30_b_castome_classes;

public class Animal {

    String name;

//    @Override
//    public String toString() {
//        return "Animal{" +
//                "name='" + name + '\'' +
//                ", population=" + population +
//                '}';
//    }

    float population;

    public String toString() {
        return "Animal name: "+name
        + "\nAnimal population: "+ population;
    }


}
