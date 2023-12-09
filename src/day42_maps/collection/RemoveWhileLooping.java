package day42_maps.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {


    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(12,34,3,6,9,1,22,45,7,2,8));

//        for (Integer each : list){
//            if (each <10){
//                list.remove(each);
//            }
//        }
//        System.out.println(list); // we cat remove too
//        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 10){
                list.remove(i);
            }
        }
        System.out.println(list); // not good to remove elements it will SKIP ELEMENTS they shift to left

        // use while loop example
        Iterator<Integer> it = list.iterator(); //
        while (it.hasNext()){
            if (it.next()<5){
                it.remove();
            }
        }
        System.out.println(list);
        list.removeIf(each -> (each < 15));












    }
}
