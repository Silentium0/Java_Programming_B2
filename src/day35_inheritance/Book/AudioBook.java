package day35_inheritance.Book;

public class AudioBook extends Book {
    double duration;
    String narrator;
    public  void listen(){
        System.out.println(" listening "+title+
                " narrator by "+narrator);
    }



}
