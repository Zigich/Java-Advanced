package Intro_To_Java_Exercise;

import java.util.Scanner;

public class Rectangle_Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sideA=scan.nextDouble();
        double sideB=scan.nextDouble();

        double area=sideA*sideB;

        System.out.printf("%.2f",area);
    }
}
