package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Miner_Task {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,Integer> totalQuantityOfResources= new LinkedHashMap<>();
        while (true){
            String resurce=reader.readLine();
            if ("stop".equals(resurce)){
                break;
            }
            int quantity=Integer.parseInt(reader.readLine());
            if (!totalQuantityOfResources.containsKey(resurce)){
                totalQuantityOfResources.put(resurce,0);
            }
            totalQuantityOfResources.put(resurce,totalQuantityOfResources.get(resurce)+quantity);

        }
        for (Map.Entry<String, Integer> s : totalQuantityOfResources.entrySet()) {
            System.out.println(s.getKey()+ " -> "+s.getValue());
        }
    }
}
