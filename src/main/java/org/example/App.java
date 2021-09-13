/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Eric Gass
 */

package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        String orderAmount = scan.nextLine();
        System.out.print("What state do you line in? ");
        String State = scan.nextLine();
        System.out.print("What county do you live in? ");
        String county = scan.nextLine();

        double quantity = Double.parseDouble(orderAmount);
        double taxPercent;
        double tax;

        if (State.toLowerCase().equals("wisconsin")) {
            if (county.toLowerCase().equals("eau claire")) {
                taxPercent = 0.055;
            } else if (county.toLowerCase().equals("dunn")) {
                taxPercent = 0.054;
            } else {
                taxPercent = 0.05;
            }
        } else if (State.toLowerCase().equals("illinois")) {
            taxPercent = 0.08;
        } else {
            taxPercent = 0;
        }

        tax = quantity*taxPercent;
        tax = Math.round(tax * 100.0) / 100.0;
        double total = Math.round(quantity * 100.0) / 100.0;
        total = total + tax;
        System.out.println(String.format("The tax is $%.2f.\nThe total is $%.2f.",tax,total));
    }
}