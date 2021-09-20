/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Paul Kelly
 */


import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 1 if you are male or a 2 if you are female: ");
        //make sure all inputs are numeric
        int gender = Integer.parseInt(input.next());
        if (gender == 1) {
            System.out.print("How many ounces of alcohol did you have? ");
            int a = Integer.parseInt(input.next());
            System.out.print("What is your weight, in pounds? ");
            int w = Integer.parseInt(input.next());
            System.out.print("How many hours has it been since you had your last drink? ");
            int h = Integer.parseInt(input.next());
            //calculate blood alcohol content
            double r = 0.73;
            double bac = (a*5.14/w*r)-0.015*h;
            System.out.printf("\nYour BAC is %.6f\n", bac);
            //check if BAC is greater than 0.08
            if (bac > 0.08) {
                System.out.println("It is not legal for you to drive.");
            } else {
                System.out.println("It is legal for you to drive.");
            }
        } else if (gender == 2) {
            System.out.print("How many ounces of alcohol did you have? ");
            //make sure input is an integer
            int a = Integer.parseInt(input.next());
            System.out.print("What is your weight, in pounds? ");
            int w = Integer.parseInt(input.next());
            System.out.print("How many hours has it been since you had your last drink? ");
            int h = Integer.parseInt(input.next());
            //calculate blood alcohol content
            double r = 0.66;
            double bac = (a*5.14/w*r)-0.015*h;
            System.out.printf("\nYour BAC is %.6f\n", bac);
            //check if BAC is greater than 0.08
            if (bac > 0.08) {
                System.out.println("It is not legal for you to drive.");
            } else {
                System.out.println("It is legal for you to drive.");
            }
        } else {
            System.out.println("Incorrect input, please try again.");
        }
    }
}
