package day41_collection.collect;

import java.util.Stack;

public class StackObj2 {


    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();
        stack.push(230);
        stack.push(0);
        System.out.println(stack);
        stack.add(2);
        stack.add(66);
        System.out.println(stack);
        System.out.println(stack.peek()); // give  last element
        System.out.println(stack);
        System.out.println(stack.pop()); // remove last element
        System.out.println(stack.pop());
        System.out.println(stack);



    }
}
