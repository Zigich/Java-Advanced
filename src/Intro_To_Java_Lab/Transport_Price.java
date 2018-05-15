package Intro_To_Java_Lab;

import java.util.Scanner;

public class Transport_Price {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double travelDistance=Double.parseDouble(scan.nextLine());
        String dayTime= scan.nextLine();

        double taxiPricePerKm=0;
        double busPricePerKm=0.09;
        double trainPricePerKm=0.06;

        if ("night".equals(dayTime)){
            taxiPricePerKm=0.90;
        }else{
            taxiPricePerKm=0.79;
        }

        double totalSum=0;

        if (travelDistance<20){
            totalSum = (taxiPricePerKm*travelDistance) + 0.7;
        }else if (travelDistance<100){
            totalSum = busPricePerKm*travelDistance;
        }else {
            totalSum = trainPricePerKm *travelDistance;
        }
        System.out.printf("%.2f",totalSum);

    }
}
