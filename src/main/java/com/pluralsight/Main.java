package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Setting up name anatomy
        System.out.print("Type in your full name please: ");
        String fullName = sc.nextLine();

        System.out.println(fullName);

        String[] nameParts = fullName.split(" ");
        String firstName = nameParts[0];

        String middleName = "";
        String lastName;

        // If statements for middle name
        if(nameParts.length == 2){
            middleName = "";
            lastName = nameParts[1];
        }
        else{
            middleName = nameParts[1];
            lastName = nameParts[2];
        }

        //Displaying
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);



    }
}
