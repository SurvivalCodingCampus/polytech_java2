package com.survivalcoding;
import java.time.LocalDate;

public class Person_encapsulation {
    public String name;
    public int birthYear;

    Person_encapsulation(String name, int birthYear) {

    }
    int getAge(int birthYear){
        LocalDate now = LocalDate.now();
        int thisYear = now.getYear();

        return thisYear - birthYear;
    }
}
