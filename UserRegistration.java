package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);
    public static final String namePattern = "[A-Z]{1}[A-Za-z]{2,}";
    public static final String emailPattern ="([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";

    //Main method
    public static void main(String[] args)
    {
        //Creating object for userRegistration class
        UserRegistration userRegistration = new UserRegistration();
        //calling readInput method here
        userRegistration.readInput();
    }
    //Creating readInput method to take input from user
    private void readInput()
    {
        System.out.println("Enter first name ");
        String firstName = sc.next();
        validateFirstName(namePattern,firstName);
        System.out.println("Enter last name ");
        String lastName = sc.next();
        validateLastName(namePattern,firstName);
        System.out.println("Enter email id ");
        String emailId = sc.next();
        validateFirstName(emailPattern,emailId);
    }
    //Creating validateFirstName method to check
    private void validateFirstName(String pattern, String input) {
        if (Pattern.matches(pattern, input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    //Creating validateLastName method to check
    private void validateLastName(String pattern, String input) {
        if (Pattern.matches(pattern, input)) {
            System.out.println("Valid");
        } else {
                System.out.println("Invalid");
            }
    }
    //Creating validateEmailId method to check
    private void validateEmailId(String pattern, String input)
    {
        if(Pattern.matches(pattern, input))
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}
