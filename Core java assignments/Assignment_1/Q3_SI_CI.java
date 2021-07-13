package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double price, rate, time, sim,com;
        Scanner sc=new Scanner (System. in);
        System.out.println("Enter the amount:");
        price=sc.nextDouble();
        System. out. println("Enter the No.of years:");
        time=sc.nextDouble();
        System. out. println("Enter the Rate of  interest");
        rate=sc.nextDouble();
        sim=(price * time * rate)/100;
        com=price * Math.pow(1.0+rate/100.0,time) - price;
        System.out.println("Simple Interest="+sim);
        System.out. println("Compound Interest="+com);
    }
}
