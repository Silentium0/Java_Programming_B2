package day05_variables;

public class School {


    public static void main(String[] args){

       /* declare and assign these variables
        number of students in grade 1
        number of students in grade 2
        number of students in grade 3
        number of students in grade 4
        number of students in grade 5

        total number of students in your school

        number of days in a year (have some half day = ~ 100.5)
        number of snow days in a year (double)
        average gpa in school (3.5) [ranges 1.0 - 4.0]

        print all of the variables with unique messages

*/
        int numberofstudentsingrade1 = 30;
        int numberofstudentsingrade2 = 40;
        int numberofstudentsingrade3 = 50;
        int numberofstudentsingrade4 = 60;
        int numberofstudentsingrade5 = 70;

        int totalnumbersOfstudent  = numberofstudentsingrade1+ numberofstudentsingrade2 + numberofstudentsingrade3+ numberofstudentsingrade4 + numberofstudentsingrade5 ;

        double NumberOfDaysInaYear = 100.5;
        double NumberOfSnowInaYear = 15;
        double averageGPAinSchool = 10.5;

        System.out.println( "number of student in Grade 1: " + numberofstudentsingrade1);
        System.out.println( "number of student in Grade 2: " + numberofstudentsingrade2);
        System.out.println( "number of student in Grade 3: " + numberofstudentsingrade3);
        System.out.println( "number of student in Grade 4: " + numberofstudentsingrade4);
        System.out.println( "number of student in Grade 5: " + numberofstudentsingrade5);

        //System.out.println(  numberofstudentsingrade1+ numberofstudentsingrade2); // multiply amount  30 + 40 = 70

        System.out.println( "Total numbers of students  " + totalnumbersOfstudent ); // numbers in line 3040


        System.out.println("Number of Snow Days a Year " +NumberOfSnowInaYear  ); // shortcut soutv
        System.out.println("Average GPA in school  " + averageGPAinSchool );
        System.out.println("number of days a year   " +NumberOfDaysInaYear );












    }

}
