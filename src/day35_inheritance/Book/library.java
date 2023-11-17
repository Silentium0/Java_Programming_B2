package day35_inheritance.Book;

public class library {

    public static void main(String[] args) {

        Book info = new Book();
        info.title = "What said Zaratustra";


        AudioBook info1 = new AudioBook();
        info1.title = "Duna";
        info1.duration = 100;
        info1.narrator = "Muy Deep";
        info1.author = new Author("Kikke Mouse",45);
        info1.listen();


        Ebook info2 = new Ebook();
        info2.title = "SoftSkills";
        info2.page = 100;
        info2.read();
        System.out.println(info2);

        Author info3 = new Author("Winnie",67);
        System.out.println(info3.getAge());





    }
}
