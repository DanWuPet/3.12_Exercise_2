package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double celsius;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius: ");
        celsius = in.nextDouble();

        double fahrenheit = (celsius * (9.0/5.0)) + 32;

        System.out.printf( "%.1f C = %.1f F", celsius, fahrenheit );

    }
}
