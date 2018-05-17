package Intro_To_Java_Exercise;

import java.util.Scanner;

public class XBytes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows=8;
        int cols=32;
        char [][] matrix = new char [rows][cols];
        for (int i = 0; i < rows; i++) {
            int number = Integer.parseInt(scan.nextLine());

            matrix[i] = Integer.toBinaryString(number).toCharArray();
        }

    }
}
