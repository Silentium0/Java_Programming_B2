package day40_exception.bank;

public class Bank {



    double balance;

    public void login(String userName, String Password) throws invalidCredentials {
        if (!userName.equals("Lulu")){
            throw new invalidCredentials("Invalid userName");

        }
        if (!Password.equals("Lulu327")){
            throw  new invalidCredentials("Invalid Password");
        }

    }




}
