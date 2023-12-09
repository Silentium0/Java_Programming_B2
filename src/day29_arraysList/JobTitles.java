package day29_arraysList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {


    public static void main(String[] args) {

        ArrayList<String> allJob = new ArrayList<>();
        allJob.addAll(Arrays.asList("SDET","Developer","PO","DEVOP","QA","Client","Team lead"));
        System.out.println("Job Titles: "+allJob);

        ArrayList<String> jobs1 = new ArrayList<>(allJob);
        jobs1.removeAll(Arrays.asList("PO","Client"));
        System.out.println("Removed: "+jobs1);

        ArrayList<String> jobs2 = new ArrayList<>(allJob);
        jobs2.retainAll(Arrays.asList("SDET","Developer"));
        System.out.println("What left after retainAll method  is :"+jobs2);

        ArrayList<String> jobs3 = new ArrayList<>(allJob);
        System.out.println(jobs3);
        jobs3.containsAll(Arrays.asList("SDET","PO","DEVOP"));
        System.out.println(jobs3.containsAll(Arrays.asList("SDET","PO","DEVOP"))); // Are the allbobs contains --> true





    }
}
