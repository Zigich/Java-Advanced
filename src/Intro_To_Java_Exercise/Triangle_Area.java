package Intro_To_Java_Exercise;

import java.util.Scanner;



public class Triangle_Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1= scanner.nextInt();
        int y1 = scanner.nextInt();

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        int area = x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2);
        int trueArea = Math.abs(area/2);

        System.out.println(trueArea);

    }
}
