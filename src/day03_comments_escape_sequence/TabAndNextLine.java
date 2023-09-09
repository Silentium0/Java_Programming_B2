package day03_comments_escape_sequence;

public class TabAndNextLine {

    public static void main(String[] args) {

        System.out.println("This is no tabbed");
        System.out.println("\ttThis is one  tabbed");  // 4  space is one TAB ( \t )
        System.out.println("\t\t\ttThis is one  tabbed");
        System.out.println("            tThis is one  tabbed");


        //  now we use new  command \n


        System.out.println("1) Go to Store");
        System.out.println("2) Got  get milk");  //   command \n  organize in line 1) 2) 3) 4) 5)
        System.out.println("3) pay money");
        System.out.println("1) pay money\n2) Got  get milk\n3) pay money");


    }


}
