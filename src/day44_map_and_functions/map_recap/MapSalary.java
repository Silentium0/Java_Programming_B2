package day44_map_and_functions.map_recap;

import java.util.HashMap;
import java.util.Map;

public class MapSalary {


    /*
Create a map that has a couple data to use. The data will be a name as the key and a salary as the value

Use the created map to find the following:

    1.1 who has the maximum salary?
    1.2 who has the minimum salary?
    1.3 how many employees has the salary between 120k ~ 150K?
    1.4 display the names of the employees who are making less than 118k?
    1.5 increase the salary of each employee by 10K
 */

    public static void main(String[] args) {



        Map <String,Double> map = new HashMap<>();
        map.put("Lilu",200_000.000);
        map.put("Franck",500_000.000);
        map.put("Mike",10_000.000);
        map.put("Bob",150_000.000);

        String nameForHighest = "";
        double highestSalary = Double.MIN_VALUE;
        String nameForLowest  = "";
        double lowesSalary = Double.MAX_VALUE;

        for (String eachKey : map.keySet()){
            double value = (map.get(eachKey));

            if (value > highestSalary){
                nameForHighest = eachKey;
                highestSalary = value;
            }
            if (value < lowesSalary){
                nameForLowest = eachKey;
                lowesSalary = value;
            }
        }
        System.out.println("Highest salary: "+highestSalary+": => earns  is "+nameForHighest);
        System.out.println("Lowest salary: "+lowesSalary+": => earns  is "+nameForLowest);

        System.out.println("________________________");

        int counter = 0;
        for (Double each : map.values()){
            if (each >=120_000 && each <= 250_000){
                counter++;

            }
        }
        System.out.println("Number of the people who make  more than 120k up to 250k:  "+counter);

        System.out.println("____Employee__Who__makes___Less___Than__170k___");
        for (String eachKey:map.keySet()){
            if (map.get(eachKey) <170_000){
                System.out.println(eachKey);

            }
        }

        for (String eachKey : map.keySet()){
            map.put(eachKey,map.get(eachKey)+10_000);
        }
        System.out.println(map);
















    }
}
