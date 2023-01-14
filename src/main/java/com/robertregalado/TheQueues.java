package com.robertregalado;

import java.util.LinkedList;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
        // FIFO (First In First Out
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Alex",21));
        queue.add(new Person("Robert",43));
        queue.add(new Person("Nida",44));

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

    }
    static record Person(String name, int age){};

}
