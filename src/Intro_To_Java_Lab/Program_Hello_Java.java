package Intro_To_Java_Lab;

import java.util.Scanner;

public class Program_Hello_Java {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord= scan.next("\\w+");
        String secondWord= scan.next("\\w+");
        int firstNum= scan.nextInt();
        int secondNum= scan.nextInt();
        int thirdNum= scan.nextInt();
        scan.nextLine();
        String thirdWord= scan.next("\\w+");
        int sum= firstNum + secondNum + thirdNum ;

        System.out.printf("%s %s %d %s ",firstWord,secondWord,sum,thirdWord);
    }
}
