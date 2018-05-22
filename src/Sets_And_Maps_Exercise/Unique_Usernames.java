package Sets_And_Maps_Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Unique_Usernames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int row =Integer.parseInt(scan.nextLine());
        Set<String> names= new LinkedHashSet<String>();
        for (int i = 0; i <row ; i++) {
            String name=scan.nextLine();
            names.add(name);
        }
        for (String name : names) {
            System.out.println(name);
        }
    }
}
