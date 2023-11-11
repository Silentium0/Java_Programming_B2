package day33_b_encapsulation.login;

public class loginorigin {


    public static void main(String[] args) {

        login obj = new login();

        //System.out.println(obj.password);
        //System.out.println(obj.username);
        //obj.username = "Taras";
        obj.setUsername("Taras");
        obj.setPassword("!@456ty1234");

        System.out.println(obj.getUsername());
        System.out.println(obj.getPassword("Taras"));







    }
}
