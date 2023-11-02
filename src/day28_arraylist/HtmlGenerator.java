package day28_arraylist;

public class HtmlGenerator {

    public static void main(String[] args) {

        System.out.println( htmlGenerator("div^3"));



    }

    public static String  htmlGenerator (String str){

        String result = "";

        String [] arr = str.split("\\^");


        int num = Integer.parseInt(arr[1]);
        for (int i = 0; i < num; i++) {

            result += "<" + arr[0] + "></"+ arr[0] + ">";



        }
        return result;
    }




}
