package com.passport;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassportSampleTest {
    Address address;
    Person person;

    @BeforeEach
    public void set_up() {
        address = new Address("Philippines", "Manila");
        person = new Person("Juan De La Cruz", "07/10/2001", "Male", "Single", address, new Passport());
    }

    @Test
    public void ___OO___DS___CS___SE___test1_get_person_info() {
        assertEquals("Juan De La Cruz", person.getFullName());
        assertEquals("07/10/2001", person.getBirthday());
        assertEquals("Male", person.getGender());
        assertEquals("Single", person.getCivilStatus());
    }

    @Test
    public void ___OO___DS___CS___SE___test2_get_person_address() {
        assertEquals("Manila, Philippines", person.getPlaceOfBirth());
    }

    @Test
    public void ___OO___DS___CS___SE___test3_get_person_age() throws ParseException {
        assertEquals(18, person.getAge());
    }

    @Test
    public void ___OO___DS___CS___SE___test4_travel_display_countries_added() {
        person.travel().addCountry("Hongkong", 7);
        person.travel().addCountry("South Korea", 3);

        List<String> expected = new ArrayList<>(
                Arrays.asList("Hongkong", "South Korea"));
        assertEquals(expected, person.travel().getCountries());
    }

    @Test
    public void ___OO___DS___CS___SE___test5_travel_display_total_days_traveled() {
        person.travel().addCountry("Hongkong", 7);
        person.travel().addCountry("South Korea", 3);

        assertEquals(10, person.travel().getTotalDaysTraveled());
    }

}
