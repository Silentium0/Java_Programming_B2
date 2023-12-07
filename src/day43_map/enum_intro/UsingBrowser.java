package day43_map.enum_intro;

public class UsingBrowser {


    public static void main(String[] args) {

        Browser browser = Browser.FIREFOX;

        switch (browser){
            case CHROME:
                System.out.println("Opening Chrome");
                break;
            case SAFARI:
            case FIREFOX:
                System.out.println("Opening Safari or FireFox ");
        }

    }
}
