package day40_exception.bank;


public class invalidCredentials extends Exception {


    public invalidCredentials(String message){
        super(message);
    }
}
