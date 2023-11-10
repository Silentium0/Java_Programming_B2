package day32_custom_classes;

public class Offer {

    String company;
    String location;
    double salary;
    boolean isfullTimeJobe;
    int numOfPTO;


    public Offer(String company, String location, double salary, boolean isfullTimeJobe, int numOfPTO) {
        this.company = company;
        this.location = location;
        this.salary = salary;
        this.isfullTimeJobe = isfullTimeJobe;
        this.numOfPTO = numOfPTO;
    }

    public  String toString(){
        return company + " location "+location+
                "\nPays $"+ salary+" salary and provides " +numOfPTO +" Number of PTO "+
                "\nthis is full time job? "+isfullTimeJobe;
    }

}
