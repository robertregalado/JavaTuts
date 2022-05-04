package com.passport;

import java.util.ArrayList;
import java.util.List;

class Persona {
    public int personId;
    public String personName;
    public int sum_days;

    public Persona(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
        sum_days = 0;
    }

    public Persona() {

    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }}

public class MultipleDataTypes{
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setPersonId(1);
        p.setPersonName("Tom");

        List<Object> lstObject = new ArrayList<Object>();
        lstObject.add("Hongkong");
        lstObject.add(7);
        lstObject.add("South Korea");
        lstObject.add(3);

        for (Object obj : lstObject) {
            if (obj.getClass() == String.class) {
                System.out.println("I found a string :- " + obj);
            }
            if (obj.getClass() == Integer.class) {

                p.sum_days += (Integer) obj;
                System.out.println("I found an int :- " + p.sum_days);
            }
            if (obj.getClass() == Float.class) {
                System.out.println("I found a float :- " + obj);
            }
            if (obj.getClass() == Person.class) {
                Persona person = (Persona) obj;
                System.out.println("I found a person object");
                System.out.println("Person Id :- " + person.getPersonId());
                System.out.println("Person Name :- " + person.getPersonName());
            }
        }
    }
}

