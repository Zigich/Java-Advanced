package Intro_To_Java_Lab;

import java.util.Scanner;

public class Average_Of_Three_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double firstNum=scan.nextDouble();
        double secondNum=scan.nextDouble();
        double thirdNum=scan.nextDouble();

        double sum=(firstNum+secondNum+thirdNum) / 3;

        System.out.printf("%.2f",sum);
    }
}
