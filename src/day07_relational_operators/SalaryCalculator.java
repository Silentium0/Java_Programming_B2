package day07_relational_operators;

public class SalaryCalculator {


    public static void main(String[] args) {



        double salary = 100_000;
        double stateTaxesRate = 0.06; //%6
        double federalTaxesRate = 0.22; // %22

        double stateTax , federalTax , totalTax , salaryAfterTax;

        stateTax = salary * stateTaxesRate;
        federalTax = salary * federalTaxesRate;
        totalTax =   stateTax + federalTax;
        salaryAfterTax = salary - totalTax;


        String  taxReport = "state tax rate :" + stateTax+","+ "Federal tax rate : " + federalTax+" Base Salary "+ salary+
                "\n Tax  amount : " + salaryAfterTax+ " for State tax  and " + federalTax+ " \nFederal Tax , in total it is  "+


                totalTax + " After tax our salary  is  "+ salaryAfterTax;

        System.out.println( taxReport);




    }



}
