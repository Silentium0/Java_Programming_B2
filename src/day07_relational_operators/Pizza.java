package day07_relational_operators;

public class Pizza {

    public static void main(String[] args) {



        /*
        create a class Pizza
        add a main method
        declare and assign these variables:

           type of pizza,  the number of slices,  the number of people eating

        calculate how many slices each person will get
        calculate how many slices are left over

        Sample print statement:

           We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
     */



        String typeOfPizza = "cheese ";
        int numOfSlices = 17;
        int numOfPeople = 4;

        int slicesPerPerson  = numOfSlices / numOfPeople;  // 10 /4 ---> 2           2
        int  slicesleftOver =  numOfSlices % numOfPeople; // 10 % 4 ---> 2


        String report = " we order "+ typeOfPizza+ "  pizza with the " + numOfSlices+ " slices " + numOfPeople+ "  people eat  "+
                slicesPerPerson + "  for each . There were  "+ slicesleftOver+"  slices left over ";

        System.out.println(report );







    }


}
