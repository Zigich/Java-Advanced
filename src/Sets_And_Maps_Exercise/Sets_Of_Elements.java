package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class Sets_Of_Elements {
    public static void main(String[] args) throws IOException {
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     String[] countOfNumbers=reader.readLine().split(" ");
     int n= Integer.parseInt(countOfNumbers[0]);
     int m= Integer.parseInt(countOfNumbers[1]);
     if (n == 0 || m == 0){
         return;
     }
     int biggerNumber=Math.max(n,m);
     int smallerNumber=Math.min(n,m);
     Set<Integer> firstNumbers=new LinkedHashSet<>();
     Set<Integer> equalNumbers=new LinkedHashSet<>();
        for (int i = 0; i < biggerNumber ; i++) {
             int number=Integer.parseInt(reader.readLine());
             firstNumbers.add(number);
        }
        for (int i = 0; i < smallerNumber ; i++) {
            int number=Integer.parseInt(reader.readLine());
            for (Integer equalNumber : firstNumbers) {
                if (equalNumber == number){
                    equalNumbers.add(number);
                }
            }
        }
        for (Integer equalNumber : equalNumbers) {
            System.out.print(equalNumber+" ");
        }
    }
}
