package com.company;

public class Driver {
    String [] category; // A, B, C ...
    int experience;  //стаж
    int penalties; //штрафы
    boolean selfCar; // на своем авто или на авто компании
    boolean international; // может совершать международные перевозки

    public Driver(String[] category, int experience, int penalties, boolean selfCar, boolean international) {
        this.category = category;
        this.experience = experience;
        this.penalties = penalties;
        this.selfCar = selfCar;
        this.international = international;
    }

    public void addPenalties(int penalties) {
        this.penalties += penalties;
    }

    public void addPenalties() {
        this.penalties++;
    }

    public void setSelfCar(boolean selfCar) {
        this.selfCar = selfCar;
    }

    public void setInternational(boolean international) {
        this.international = international;
    }
}
