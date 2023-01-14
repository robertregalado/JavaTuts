package com.robertregalado;

import java.util.LinkedList;
import java.util.ListIterator;

public class TheLinkedLists {
    public static void main(String[] args) {
        LinkedList<Person> linkedlist = new LinkedList<>();
        linkedlist.add(new Person("Alex",21));
        linkedlist.add(new Person("Alexa",22));
        linkedlist.addFirst(new Person("Alibaba",15));
        linkedlist.add(new Person("Zion",102));
        System.out.println(linkedlist.size());
        System.out.println(linkedlist.stream().sorted());

        ListIterator<Person> personListIterator = linkedlist.listIterator();
        System.out.println();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();

        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
        System.out.println();

    }

    static record Person(String name, int age){};
}
