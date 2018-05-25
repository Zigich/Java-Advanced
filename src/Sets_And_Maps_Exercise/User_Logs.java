package Sets_And_Maps_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class User_Logs {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Map<String,Integer>> userLogs=new TreeMap<>();
        while(true){
            String input=reader.readLine();
            if ("end".equals(input)){
                break;
            }
            String[] username=input.split("user=");
            String user=username[1];
            String[] ipRaw=input.split(" message");
            String[] ip=ipRaw[0].split("IP=");
            Map <String,Integer> countOfMessages=new LinkedHashMap<>();
            if (!userLogs.containsKey(user)){
                userLogs.put(user,countOfMessages);
            }
            countOfMessages=userLogs.get(user);
            if (!countOfMessages.containsKey(ip[1])) {
                countOfMessages.put(ip[1], 1);
            }else {
                countOfMessages.put(ip[1],countOfMessages.get(ip[1])+1);
            }

        }
        for (String s : userLogs.keySet()) {
            System.out.println(s+":");
            StringBuilder sb = new StringBuilder();
            for (String s1 : userLogs.get(s).keySet()) {

                sb.append(String.format("%s => %s, ", s1,  userLogs.get(s).get(s1)));
            }
            sb.deleteCharAt(sb.length() - 1);
            sb.deleteCharAt(sb.length() - 1);
            sb.append(".");
            System.out.println(sb);
        }
        String Debug="";
    }
}

