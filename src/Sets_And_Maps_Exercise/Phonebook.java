package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Phonebook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String,String> phonebook=new LinkedHashMap<>();
        while (true){
            String[] input = reader.readLine().split("-");
            String searchName=input[0];
            if ("search".equals(input[0])){
                break;
            }
            String name=input[0];
            String contact=input[1];
            if (!phonebook.containsKey(name)){
                phonebook.remove(name);
                phonebook.put(name,contact);
            }else {
                phonebook.put(name,contact);
            }

        }
        while (true){
            String name=reader.readLine();
            if ("stop".equals(name)){
                break;
            }
            if (phonebook.containsKey(name)){
                System.out.println(name+" -> "+phonebook.get(name));
            }else {
                System.out.println("Contact "+name+" does not exist.");
            }
        }

    }
}
