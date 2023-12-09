package day33_a_static;

public class Song2 {


    public static void main(String[] args) {


        Song info1 = new Song("Ambient");
        System.out.println(info1);
        Song info2 = new Song("Ambient",4.5);
        System.out.println(info2);
        Song info3 = new Song("Ambient",4.5,"Nubiru","Lofit");
        Song info4 = new Song("Ambient",4.5,"Nubiru","Lofit");
        System.out.println(info4);



    }
}
