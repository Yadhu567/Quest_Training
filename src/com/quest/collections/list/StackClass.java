package com.quest.collections.list;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.search(2 ));
        /*System.out.println(stack.add(6));
        System.out.println(stack.size());*/
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }
}
