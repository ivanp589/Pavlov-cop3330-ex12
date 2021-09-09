package org.example;

import java.util.Scanner;

import static java.lang.System.out;
//import static java.math.RoundingMode.UP;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App math = new App();
        App ask = new App();
        double prin = ask.amount();
        double rate = ask.rate();
        int years = ask.years();
        double total1 = math.calc(rate,years, prin);
        double total = math.rounds(total1);
        System.out.println(String.format("After %d years at %.2f" +
                ", the investment will be worth $%.2f.", years, rate, total));
      //  out.print(String.format("%f total1, %f total",total1,total));test line
    }

    private double amount() {
        out.print("Enter the principal: ");
        return in.nextDouble();
    }
    private double rate(){
        out.print("Enter the rate of interest: ");
        return in.nextDouble();
    }
    private int years(){
        out.print("Enter the number of years: ");
        return in.nextInt();
    }
    private double calc(double rate,int years,double prin){
        return prin*(1+((rate/100)*years));
    }
    private double rounds( double total1){
        double roundOff=Math.ceil(total1*100)/100;
        return roundOff;
    }
}