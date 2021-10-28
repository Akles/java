package com.company;

public class Teacher {
    String [] speciality; //специальность (математика, русский язык и летература...)
    int experience;  //стаж
    String position; //должность (учитель, завуч ...)
    boolean hasClass; // ведет класс как классный руководитель
    int hoursPerMonth; // Сколько уроков(часов) в месяц

    public Teacher(String[] speciality, int experience, String position, boolean hasClass, int hoursPerMonth) {
        this.speciality = speciality;
        this.experience = experience;
        this.position = position;
        this.hasClass = hasClass;
        this.hoursPerMonth = hoursPerMonth;
    }

    public void addSpeciality(String speciality) {
        String [] result =  new String[this.speciality.length + 1];
        for (int i = 0; i < this.speciality.length; i++) {
            result[i] = this.speciality[i];
        }
        result[this.speciality.length] = speciality;
        this.speciality = result;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setHasClass(boolean hasClass) {
        this.hasClass = hasClass;
    }

    public void setHoursPerMonth(int hoursPerMonth) {
        this.hoursPerMonth = hoursPerMonth;
    }
}
