package Sets_And_Maps_Lab;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Parking_Lot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Set<String> parkingLot= new HashSet<String>();
        String input=scan.nextLine();
        while ("END".equals(input)){

            input = scan.nextLine();
        }

    }
}
