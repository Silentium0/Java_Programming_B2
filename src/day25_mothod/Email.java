package day25_mothod;

public class Email {


    public static void main(String[] args) {
        String name = "James Bond";
        String  domain = "gmail";
        generateEmail(name, domain);
    }

    public static void generateEmail(String  name, String domain) {

        String  email = ("" +name.charAt(0) + name.substring(name.indexOf(" ") + 1) + "@"+ domain+".com").toLowerCase();
        System.out.println(email);


    }
}
