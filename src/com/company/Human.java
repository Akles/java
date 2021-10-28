package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Human {
    String name;
    Date dateOfBirth;
    String sex; // TODO: use public enum
    double weight;
    double height;

    public int getAge() {
        Date now = new Date();
        long timeBetween = now.getTime() - dateOfBirth.getTime();
        double yearsBetween = timeBetween / 3.15576e+10;
        int age = (int) Math.floor(yearsBetween);

        return age;
    }

    public double getIMT(){
        return weight/(height*height);
    }


}
