package String_Processing_Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class Sum_Big_Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigDecimal firstNum= new BigDecimal(scan.nextLine());
        BigDecimal secondNum= new BigDecimal(scan.nextLine());
        BigDecimal result= firstNum.add(secondNum);
        System.out.println(result);

    }
}
