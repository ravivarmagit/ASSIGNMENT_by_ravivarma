package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        for (int Attempts = 1; Attempts <=3; Attempts++) {
            System.out.print("Enter Username: ");
            String user = input.nextLine();

            System.out.print("Enter Password: ");
            String pass = input.nextLine();

            if (user.equals("ken") && pass.equals("ken@007")) {
                System.out.println("Welcome " + user);
                break;
            } else{
                System.out.println("incorrect user id or password \n Remaining attempts "+ (3-Attempts));
                if(Attempts >= 3){
                    System.out.println("Contact Admin");
                }
            }
        }
    }
}
