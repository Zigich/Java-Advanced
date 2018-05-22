package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class Count_Symbols {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] input = reader.readLine().toCharArray();
        Map<Character, Integer> symbolCounter= new TreeMap<>();

        for (char s : input) {
            if (!symbolCounter.containsKey(s)){
                symbolCounter.put(s,1);
            }else {
                symbolCounter.put(s, symbolCounter.get(s) + 1);
            }
        }
        for (Character symbol : symbolCounter.keySet()) {
            System.out.println(symbol+": "+symbolCounter.get(symbol)+" time/s");
        }
    }
}
