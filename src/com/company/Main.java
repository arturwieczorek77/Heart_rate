package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        String name = "";
        String surname = "";
        int day = 0;
        int month = 0;
        int year = 0;

        Scanner input = new Scanner(System.in);

        System.out.printf("Please, enter your name and confirm with <Enter>: ");
        name = input.nextLine();

        System.out.printf("Please, enter your surname and confirm with <Enter>: ");
        surname = input.nextLine();

        System.out.printf("Enter your date of birth in numbers and confirm with <Enter> ... day: ");
        day = input.nextInt();

        System.out.printf(" ... month: <Enter> ");
        month = input.nextInt();

        System.out.printf(" ... full year like 2001: <Enter> ");
        year = input.nextInt();

        HeartRates osoba = new HeartRates(name, surname, day, month, year);

        osoba.displayPersonData(osoba);
    }
}
