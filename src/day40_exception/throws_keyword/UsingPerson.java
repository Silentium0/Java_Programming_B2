package day40_exception.throws_keyword;

public class UsingPerson {


    public static void main(String[] args)  {


        Person obj = new Person();


        try {
            obj.setName("lulu"); // empty will give you  null

        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            obj.setAge(-50);
        }catch (IllegalArgumentException w){
            System.out.println(w.getMessage());        }


        System.out.println(obj.getName());
        System.out.println("DONE");



    }
}
