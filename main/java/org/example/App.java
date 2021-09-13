/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        // inputs 1 and 2 ask the user for the order amount and state
        Scanner input = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String inputOrderAmount = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.print("What is the state? ");
        String inputState = input2.nextLine();

        // created a double for the inputted amount, a constant tax amount that can be added to the WI subtotal, and
        // an updated tax variable that will be added to the WI amount
        double convertedOrderAmount = Double.parseDouble(inputOrderAmount);
        double taxAmount = 5.5 / 100;
        double subtotal = convertedOrderAmount;
        double updatedTax = 0;

        // extra math done for amounts that are form WI, with there being an output in the if statement
        if (inputState.equals("WI"))
        {
            updatedTax = taxAmount * convertedOrderAmount;
            subtotal += updatedTax;
            System.out.println(String.format("The subtotal is %.2f.\nThe tax is $%.2f.", convertedOrderAmount, updatedTax));
        }

        System.out.println(String.format("The total is $%.2f", subtotal));
    }
}
