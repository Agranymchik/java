package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double calculation (double a, double b, double c)
    {
        double d;
        if (a !=0 && b != 0 && c !=0) {
            d = b*b-4*a*c;
            System.out.println("d = " + d);
            
            if (d > 0) {
                System.out.println("x1 = " + (-b - Math.sqrt(d)) / (2 * a));
                System.out.println("x2 = " + (-b + Math.sqrt(d)) / (2 * a));
                return 0;
            } else if (d == 0) {
                System.out.println("x = " + (-b) / (2 * a));
                return 0;
            }
        }
        System.out.println("no solution...");
        return  0;
    }

    public static void main(String[] args) {
	// write your code here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;

        System.out.println("a*x^2 + b*x + c = 0");

        try {
            System.out.println("a = ");

            a = Double.parseDouble(read.readLine().replace(",", "."));
            System.out.println("b = ");
            b = Double.parseDouble(read.readLine().replace(",", "."));
            System.out.println("c = ");
            c = Double.parseDouble(read.readLine().replace(",", "."));

            calculation(a, b, c);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
