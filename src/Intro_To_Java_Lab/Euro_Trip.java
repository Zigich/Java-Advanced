package Intro_To_Java_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class Euro_Trip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal kg=new BigDecimal(scan.nextLine());
        BigDecimal priceInLv=new BigDecimal("1.20");
        BigDecimal priceLvToMark=new BigDecimal("4210500000000");
        BigDecimal sumInLv= priceInLv.multiply(kg);
        BigDecimal totalMarks=sumInLv.multiply(priceLvToMark);
        System.out.printf("%.2f",totalMarks);

    }
}
