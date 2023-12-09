package day42_maps.collection;

import java.util.PriorityQueue;

public class QueueObjects {


    public static void main(String[] args) {


        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(2);
        queue.offer(23);
        queue.add(4);
        queue.add(4);
        try {

            queue.add(null);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        //queue.get(); you can NOT get index
        System.out.println(queue);

        queue.remove(5);// so matches in list to remove
        System.out.println(queue);
        queue.remove(2); // it removes element ,  we have such object in list
        System.out.println(queue);

        queue.poll(); // it removes element from beginning
        System.out.println(queue);


        //System.out.println(new PriorityQueue<>().remove()); // it new object so NO elements to remove
        System.out.println(new PriorityQueue<>().poll()); // but this will give you null

    }


}
