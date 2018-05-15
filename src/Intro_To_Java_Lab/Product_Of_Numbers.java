package Intro_To_Java_Lab;

import java.util.Scanner;

public class Product_Of_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int sum=1;
        for (int i = n; i < m; i++) {
            sum*=i;
        }
        System.out.printf("product[%d..%d]=%d",n,m,sum);
    }
}
