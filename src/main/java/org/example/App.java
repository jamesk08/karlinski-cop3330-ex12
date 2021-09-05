/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */

package org.example;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        System.out.print("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        double principalInput = scanner.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interestRateInput = scanner.nextDouble();

        System.out.print("Enter the number of years: ");
        double numberOfYears = scanner.nextDouble();

        double returnOnInvestment = GetRoi(interestRateInput, numberOfYears, principalInput);

        DecimalFormat moneyFormatter = new DecimalFormat("#,##0.00");

        String summaryMessage = MessageFormat.format(
            "After {0} years at {1}%, the investment will be worth ${2}",
            numberOfYears,
            interestRateInput,
            moneyFormatter.format(returnOnInvestment)
        );

        System.out.print(summaryMessage);
    }

    /**
     * Calculates the total return on investment with given principal, interest rate and the total amount of years.
     */
    private static double GetRoi(double interestRateInput, double numberOfYears, double principalInput)
    {
        var returnOnInvestment = principalInput * ( 1 + (( interestRateInput / 100 ) * numberOfYears ));
        return returnOnInvestment;
    }
}
