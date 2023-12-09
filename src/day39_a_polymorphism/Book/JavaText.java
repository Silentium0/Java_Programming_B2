package day39_a_polymorphism.Book;

public class JavaText extends Ebook {

    boolean isFun;


    @Override
    public void open() {
        System.out.println("Opening a  java book ");
    }

    @Override
    public void read() {
        System.out.println("Reading java  Text Book");
    }

    @Override
    public void download() {
        System.out.println("Downloading java Text");
    }
}
