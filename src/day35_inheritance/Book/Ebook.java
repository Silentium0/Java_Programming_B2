package day35_inheritance.Book;

public class Ebook extends Book {

    int page;
    public  void read(){
        System.out.println(" reading a digital copy of "+title+
                " witch has "+page+" pages");
    }
}
