package day32_custom_classes;

public class Employee {


    String name;
    int id;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, int id, double salary){

        this.name = name;
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return  "Info about Employee" +
                " \n\tName: " + name +
                " \n\tId: " + id +
                " \n\tJobTitle: " + jobTitle +
                " \n\tSalary: " + salary ;





    }

}
