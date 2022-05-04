package com.passport;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Philippines", "Manila");
        Person person = new Person("Juan De La Cruz", "07/10/2001", "Male", "Single", address, new Passport());
        Passport p = new Passport();
        System.out.println(person.getPlaceOfBirth());
        System.out.println(p.getTotalDaysTraveled());


    }


}
