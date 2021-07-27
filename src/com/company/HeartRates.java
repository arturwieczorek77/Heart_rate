package com.company;

import java.time.Duration;
import java.time.LocalDate;

public class HeartRates {

    private String name;
    private String surname;
    private int day;
    private int month;
    private int year;

    public HeartRates(String name, String surname, int day, int month, int year){

        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public long numberOfYears(){
        LocalDate userDate = LocalDate.of(getYear(), getMonth(), getDay());
        LocalDate dateNow = LocalDate.now();
        Duration diff = Duration.between(userDate.atStartOfDay(), dateNow.atStartOfDay());
        long personYears = diff.toDays()/365;
        return personYears;
    }

    public int maxHeartRate(int x){
        int maxHeartRate = 220 - x;
        return maxHeartRate;
    }

    public String targetHeartRate(int y){
        double minRate = y * 0.5;
        double maxRate = y * 0.85;
        int y1 = Math.toIntExact((int) minRate);
        int y2 = Math.toIntExact((int) maxRate);

        return "Your target heart rate is between " + minRate + " and " + maxRate +" beats per minute.";

    }

    public void displayPersonData(HeartRates personData){
        System.out.printf("---Your data---\nName: %s\nSurname: %s\nAge: %s.\nYour maximum heart rate is %s beats per minute.\n%s", personData.getName(), personData.getSurname(), personData.numberOfYears(), personData.maxHeartRate(Math.toIntExact(personData.numberOfYears())), personData.targetHeartRate(personData.maxHeartRate(Math.toIntExact(personData.numberOfYears()))));
    }

}
