package day39_a_polymorphism.Book;

public class Library {

    public static void main(String[] args) {

        JavaText info = new JavaText();
        info.name = "Java programing";
        info.size = 1.5;
        info.isFun = true;

        info.open();
        info.download();
        info.read();

        System.out.println();

        Ebook info2 = new JavaText();
        info2.name = "Java Programing 2";
        info2.size = 3.5;
        //info2.isFun // No access to isFun variable
        //but we can cast to get access
        ((JavaText)info2).isFun = false; // casted
        ((JavaText) info2).isFun = true;
        info2.open();
        info2.download();
        info2.read();
        System.out.println(((JavaText) info2).isFun);

        System.out.println();

        Book info3 = new JavaText();
        info3.name = "Java P-3";
        info3.read();
        System.out.println(info3.name);

        System.out.println();


        Downloadable info4 = new JavaText();
        info4.download(); // access just to ane method

        System.out.println();

        JavaText info5 =  (JavaText)info3; // casted object
        info5.open();
        info5.download();
        info5.read();

        // we cast, it is  takes less memory







    }
}
