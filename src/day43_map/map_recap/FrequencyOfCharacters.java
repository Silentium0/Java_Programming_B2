package day43_map.map_recap;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str = "AAApple";
        String str1 = "Loopcamp";
        mapaarray(str);
        mapaarray(str1);


    }

    public static void mapaarray (String str){
        Map<Character,Integer> list = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char each =  str.charAt(i);
            if (!list.containsKey(each)){
                list.put(each,1);
            } else {
                list.put( each,   list.get(each)  + 1      );

            }
        }
        System.out.println(list);







    }
}
