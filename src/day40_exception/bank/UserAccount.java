package day40_exception.bank;

public class UserAccount {

    public static void main(String[] args) {


        Bank account = new Bank();
        account.balance = 230000;


        try {
            account.login("Lulu","Lul327");

        }catch (invalidCredentials e){
            System.out.println(e.getMessage());
        }


    }
}
