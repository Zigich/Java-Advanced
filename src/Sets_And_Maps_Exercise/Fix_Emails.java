package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Fix_Emails {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> fixEmails= new LinkedHashMap<>();
        while (true){
            String name=reader.readLine();
            if ("stop".equals(name)){
                break;
            }
            String email=reader.readLine();
            String[] validEmails=email.split("\\.");
            if ("bg".equals(validEmails[1])){
                fixEmails.put(name,email);
            }


        }
        for (Map.Entry<String, String> s : fixEmails.entrySet()) {
            System.out.println(s.getKey()+ " -> "+s.getValue());
        }
    }
}
