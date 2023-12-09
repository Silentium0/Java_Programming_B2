package day45_stream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UseConsumer {


    public static void main(String[] args) {

        Consumer<Integer> printToN = n -> {
            for (int i = 0; i <= n; i++) {
                System.out.println(i + "");
            }
        };
        printToN.accept(7);

        List<String> list = new ArrayList<>(Arrays.asList("Hello","Enter","Month"));

        list.forEach(each -> System.out.println(each));

        list.forEach(each -> System.out.println(each.charAt(0)+ " " + each.charAt(each.length() -1 )));
        System.out.println("_______________");
        list.forEach( each -> {
            if (each.length() >= 5) {
                System.out.println(each);
            }
        });

    }


}
