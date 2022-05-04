package com.passport;

/**
 * Each person can only have one passport. A Person object can accept the person's name,
 * birthday, gender, civil status, an address object and a passport object.
 * Based on the person’s birthday, calculate the age. If a person wants to travel,
 * it will return the passport and can access the features such as adding the country
 * and the number of days to stay. It can also display all the countries visited,
 * and the total days the person has been traveling.

NOTE: The birthday input should be in this format: dd/MM/yyyy October 7, 2001 -> 07/10/2001

If there is no address added, return “No address added”.
 */
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.time.*;
import java.util.*;
import java.util.Date;


class Person {
    private String fullName;
    private String birthday;
    private String gender;
    private String civilStatus;
    private Address placeOfBirth;
    private Passport passport;
    //private String inDate;
    private static SimpleDateFormat inSDF = new SimpleDateFormat("mm/dd/yyyy");
    private static SimpleDateFormat outSDF = new SimpleDateFormat("yyyy/mm/dd");

    public Person(String fullName, String birthday, String gender, String civilStatus, Address placeOfBirth, Passport passport) {
        //Initialization
        this.fullName = fullName;
        this.birthday = birthday;
        this.gender = gender;
        this.civilStatus = civilStatus;
        this.placeOfBirth = placeOfBirth;
        this.passport = passport;
    }

    //getters
    public String getFullName() {
        return fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth.getAddress();
    }

    public int getAge() throws ParseException {
        String d = formatDate(getBirthday());
        LocalDate date1 = LocalDate.parse(d);

        ZonedDateTime zonedDateTime = date1.atStartOfDay(ZoneId.systemDefault());
        Instant instant = zonedDateTime.toInstant();
        Date date2 = Date.from(instant);
        Calendar c = Calendar.getInstance();
        c.setTime(date2);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        LocalDate l1 = LocalDate.of(year, month, date);
        LocalDate now1 = LocalDate.now();
        Period diff1 = Period.between(l1, now1);
        return diff1.getYears();

    }

    public Passport travel() {
        return passport;

    }

    public String formatDate(String inDate) {
        String outDate = "";
        if (inDate != null) {
            try {
                Date date = inSDF.parse(inDate);
                outDate = outSDF.format(date);
            } catch (ParseException ex) {
            }
        }
        return outDate;
    }
}
class Address {
    public String placeOfBirth;
    private String country;
    private String city;

    public Address(String country, String city) {

        this.country = country;
        this.city = city;
    }

    public String getAddress() {
        String address = city + ", " + country;
        return address;

    }
}

public class Passport {
    private String country;
    private int days;
    List<Object> lstObject = new ArrayList<Object>();
    int sum_days = 0;

    public void addCountry(String country, int days) {
        lstObject.add(country);
        lstObject.add(days);
    }

    public List<String> getCountries() {
        List<String> listCountries = new ArrayList<>();
        for (Object obj : lstObject) {
            if (obj.getClass() == String.class) {
                listCountries.add((String) obj);
                //System.out.println("I found a string :- " + obj);
            }
        }
        return listCountries;
    }

    public int getTotalDaysTraveled() {
        for (Object obj : lstObject) {
            if (obj.getClass() == Integer.class) {
                sum_days += (Integer) obj;
                //System.out.println("I found an int :- " + sum_days);
            }
        }
        return sum_days;
    }

}

