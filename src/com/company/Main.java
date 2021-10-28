package com.company;

import javax.print.Doc;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.dateOfBirth = new Date("10/15/1991");
        h1.weight = 80;
        h1.height = 1.94;
        h1.sex = "male";
        h1.name = "Alex";

        System.out.println(h1.getAge());
        System.out.println(h1.getIMT());

        Doctor doctor1 = new Doctor("Терапевт", 10, "Врач", false, "Первой категории");
        doctor1.setDuty(true);
        doctor1.setPosition("Главврач");
        doctor1.setCategory("Высшей категории");

        System.out.println(doctor1.duty);
        System.out.println(doctor1.position);
        System.out.println(doctor1.category);

        Teacher t1 = new Teacher(new String[]{"математика", "информатика"}, 2, "учитель", false, 20);

        t1.setPosition("классный руководитель");
        t1.setHasClass(true);
        t1.addSpeciality("физика");
        t1.setHoursPerMonth(30);

        System.out.println(t1.position);
        System.out.println(t1.hasClass);
        System.out.println(Arrays.toString(t1.speciality));
        System.out.println(t1.hoursPerMonth);

        Driver driver1 = new Driver(new String[]{"A", "B"}, 1, 1, true, true);

        driver1.addPenalties();
        driver1.addPenalties(2);
        driver1.setSelfCar(false);
        driver1.setInternational(false);

        System.out.println(driver1.penalties);
        System.out.println(driver1.selfCar);
        System.out.println(driver1.international);
    }
}
