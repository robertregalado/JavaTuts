package com.robertregalado;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(34);

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.add(10));
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.empty());
    }

}
