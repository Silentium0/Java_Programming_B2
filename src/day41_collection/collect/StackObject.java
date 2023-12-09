package day41_collection.collect;

import java.util.Stack;

public class StackObject {

    public static void main(String[] args) {

        Stack<Character> list = new Stack<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        System.out.println(list);
        System.out.println("Last in first out: "+list.peek());
        list.pop(); // remove last element
        System.out.println(list);
        list.pop();// remove last element
        System.out.println(list);


    }
}
