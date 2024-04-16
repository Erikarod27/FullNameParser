package com.pluralsight;

import java.util.Scanner;

public class FullNameParserApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name (first last or first middle last): ");
        String fullName = scanner.nextLine().trim();

        //Split name between spaces
        String[] nameParts = fullName.split("\\s+");

        //first name at index 0
        String firstName = nameParts[0];
        System.out.println("First name: " + firstName);

        //middle name if entered
        String middleName = "";
        if (nameParts.length > 2) {
            middleName = nameParts[1];
            //shorten middle name to single character with period
            if (middleName.length() >= 1) {
                middleName = middleName.substring(0, 1) + ".";
            }
        }
        System.out.println("Middle name: " + middleName);

        //last name at last index
        String lastName = nameParts[nameParts.length -1];
        System.out.println("Last name: " + lastName);


    }
}
