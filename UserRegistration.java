package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);
    public static final String namePattern = "[A-Z]{1}[A-Za-z]{2,}";
    public static final String emailPattern ="([0-9A-Za-z])+([-+._][0-9A-Za-z]+)*" + "@([0-9A-Za-z])+[.]([a-zA-Z])+([.][A-Za-z]+)*";
    public static final String numberPattern="^[+0-9]{2}{10}$";
    public static final String passwordPattern = "[0-9a-zA-Z!@#$%^&*]{8,}";
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
        //calling validateFirstName method
        validateFirstName(namePattern,firstName);

        System.out.println("Enter last name ");
        String lastName = sc.next();
        //calling validateLastName method
        validateLastName(namePattern,lastName);

        System.out.println("Enter email id ");
        String emailId = sc.next();
        //calling validateEmailId method
        validateEmailId(emailPattern,emailId);

        System.out.println("Enter phoneNumber");
        String phoneNumber = sc.next();
        //calling validateNumberPattern method
        validateNumberPattern(numberPattern,phoneNumber);

        System.out.println("Enter a password");
        String password = sc.next();
        //calling validatePassword method
        validatePassword(passwordPattern,password);

        System.out.println("Enter the password atleast one upperCase");
        String password1 = sc.next();
        //calling validatePassword method
        validatePassword(passwordPattern,password);

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
        } else {
            System.out.println("Invalid");
        }
    }
    //Creating validateNumberPattern method to check
    private void validateNumberPattern(String pattern, String input) {
        if (Pattern.matches(pattern, input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    //Creating validatePassword method to check
    private void validatePassword(String pattern, String input) {
        if (Pattern.matches(pattern, input)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
