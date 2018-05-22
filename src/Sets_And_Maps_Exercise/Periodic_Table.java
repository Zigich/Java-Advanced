package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Periodic_Table {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int rows=Integer.parseInt(reader.readLine());
        Set<String> pereodicTable=new TreeSet<>();
        for (int i = 0; i <rows ; i++) {
            String[] input= reader.readLine().split("\\s+");
            for (String s : input) {
                pereodicTable.add(s);
            }
        }
        for (String element : pereodicTable) {
            System.out.print(element+" ");
        }

    }
}
