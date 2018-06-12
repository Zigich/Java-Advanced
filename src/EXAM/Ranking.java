package EXAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Ranking {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> courses = new HashMap<>();
        Map<String, Map<String, Integer>> candidates = new TreeMap<>();


        String input = reader.readLine();
        while (!"end of contests".equals(input)) {
            String[] tokens = input.split(":");
            String course = tokens[0];
            String password = tokens[1];

            courses.putIfAbsent(course, password);

            input = reader.readLine();
        }

        input = reader.readLine();
        while (!"end of submissions".equals(input)) {
            String[] splitter = input.split("=>");
            String course = splitter[0];
            String password = splitter[1];
            String name = splitter[2];
            Integer points = Integer.parseInt(splitter[3]);

            if (!(courses.containsKey(course) && courses.get(course).equals(password))) {
                input = reader.readLine();
                continue;
            }

            candidates.putIfAbsent(name, new LinkedHashMap<>());
            candidates.get(name).putIfAbsent(course, 0);
            candidates.get(name).put(course, Math.max(candidates.get(name).get(course), points));

            input = reader.readLine();
        }

        int maxResult = Integer.MIN_VALUE;
        String name = "";
        for (Map.Entry<String, Map<String, Integer>> student : candidates.entrySet()) {
            int result = 0;
            for (Map.Entry<String, Integer> c : student.getValue().entrySet()) {
                result += c.getValue();
            }

            if (result > maxResult) {
                maxResult = result;
                name = student.getKey();
            }
        }
        System.out.printf("Best candidate is %s with total %d points.%n",name,maxResult);
        System.out.println("Ranking: ");

        candidates.entrySet().stream()
                .forEach(s -> {

                    System.out.println(s.getKey());

                    s.getValue().entrySet().stream()
                            .sorted((c1, c2) -> c2.getValue().compareTo(c1.getValue()))
                            .forEach(c ->
                                            System.out.printf("#  %s -> %d%n",c.getKey(),c.getValue())
//
                            );
                });

        System.out.println();
    }
}

