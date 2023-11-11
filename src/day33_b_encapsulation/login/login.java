package day33_b_encapsulation.login;

public class login {


    private String username;
   private  String  password;


   public  void setUsername(String username){
       this.username = username;
   }
   public void setPassword(String password){
       if (password.length()>=8){
           this.password = password;
       }
   }

   public  String getUsername(){
       return username;
   }

    public  String getPassword(){
        return password;
    }

    public  String getPassword(String lastFourUserName) {
        if (lastFourUserName.equals(username.substring(username.length() - 4))) {
            return password;
        }
        return "Wrong input";
    }



}
