package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static double calculation (double a, double b, double c)
    {
        double d;
        d = b*b-4*a*c;
        System.out.println("d = " + d);
        if (d>0){
            System.out.println("x1 = " + (-b - Math.sqrt(d)) / (2*a));
            System.out.println("x2 = " + (-b + Math.sqrt(d)) / (2*a));
            return 0;
        } else if (d == 0){
            System.out.println("x = " + (-b) / (2*a));
            return 0;
        }
        System.out.println("D < 0, no solution...");
        return  0;
    }

    public static void main(String[] args) {
	// write your code here
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        double a, b, c;

        System.out.println("a*x^2 + b*x + c = 0");

        try {
            System.out.println("a = ");
            a = Integer.parseInt(read.readLine());
            System.out.println("b = ");
            b = Integer.parseInt(read.readLine());
            System.out.println("c = ");
            c = Integer.parseInt(read.readLine());

            calculation(a, b, c);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
