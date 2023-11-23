package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String cc = parseCreditCardNumber("ABC4444333322221111");
        //call validateCreditCardNumber() method
        boolean isValid = validateCreditCardNumber(cc);
        System.out.println("Credit card number is " + cc);
        System.out.println("Credit card number is " + isValid);
        
    }

    //create a method to parse credit card number
    public static String parseCreditCardNumber(String creditCardNumber) {
        //remove all non-digit characters
        String parsedCreditCardNumber = creditCardNumber.replaceAll("[^\\d]", "");

        //check if the credit card number is valid
        if (parsedCreditCardNumber.length() != 16) {
            return "Invalid credit card number";
        }

        //mask the credit card number
        String maskedCreditCardNumber = parsedCreditCardNumber.substring(0, 4) + " "
                + parsedCreditCardNumber.substring(4, 8) + " "
                + parsedCreditCardNumber.substring(8, 12) + " "
                + parsedCreditCardNumber.substring(12, 16);

        return maskedCreditCardNumber;
    }


    //create a method to validate credit card number
    public static boolean validateCreditCardNumber(String creditCardNumber) {
        //remove all non-digit characters
        String parsedCreditCardNumber = creditCardNumber.replaceAll("[^\\d]", "");

        //check if the credit card number is valid
        if (parsedCreditCardNumber.length() != 16) {
            return false;
        }

        //calculate the sum of all digits
        int sum = 0;
        for (int i = 0; i < parsedCreditCardNumber.length(); i++) {
            //get the digit at the current position
            int digit = Integer.parseInt(parsedCreditCardNumber.substring(i, i + 1));

            //multiply the digit by 2 if its position is even
            if (i % 2 == 0) {
                digit *= 2;
            }

            //add the digit to the sum if it is less than 10
            if (digit < 10) {
                sum += digit;
            } else {
                //add the two digits together if the digit is greater than 10
                sum += digit / 10;
                sum += digit % 10;
            }
        }

        //return true if the sum is divisible by 10
        return sum % 10 == 0;
    }
}