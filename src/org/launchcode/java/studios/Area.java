package org.launchcode.java.studios;

import java.util.Scanner;

import static java.lang.Math.PI;

/**
 * Created by Kevin on 2/28/2017.
 */
public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = in.nextDouble();
        area = PI * radius * radius;
        System.out.println("The area of your cicle is: " + area);
    }
}
