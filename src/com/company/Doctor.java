package com.company;

public class Doctor {
    String speciality; //специальность (терапевт, лор...)
    int experience;  //стаж
    String position; //должность (врач, медсестра, интерн, галвврач, зав отделением ...)
    boolean duty; //включен в список дежурств
    String category; // вторая, первая, высшая

    public Doctor(String speciality, int experience, String position, boolean duty, String category) {
        this.speciality = speciality;
        this.experience = experience;
        this.position = position;
        this.duty = duty;
        this.category = category;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDuty(boolean duty) {
        this.duty = duty;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
