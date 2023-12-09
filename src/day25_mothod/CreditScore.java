package day25_mothod;

public class CreditScore {

    public static int  creditScore () {
        return 800;

    }

    public static boolean goodScore (int score) {
        if (score >= 700){
            return true;
        }else {
            return false; // you have to have return otherwise will be error  in boolean
        }

        // return  score >=700; // or like short option

    }

    public static void main(String[] args) {
        creditScore();
        System.out.println(creditScore());
        System.out.println(creditScore()+50);

        System.out.println("______");
        int score = creditScore();

        System.out.println(score);
        System.out.println(goodScore(score)); // we got (score 800) so we got true
        System.out.println(goodScore(350)); // less than  800 so false
        System.out.println(goodScore(score - 400)); // less than  (700 - 400 = 300) so false
        System.out.println(goodScore(500) ? "Is GOOD score" : "Is NOT GOOD score");


    }
}
