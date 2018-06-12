package EXAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Intership_Problem {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countOfProblems = Integer.parseInt(reader.readLine());
        int countOfPeoples = Integer.parseInt(reader.readLine());
        ArrayDeque<String> peoples=new ArrayDeque<>();
        ArrayDeque<String> problems = new ArrayDeque<>();
        for (int i = 0; i <countOfProblems ; i++) {
            String problem = reader.readLine();
            problems.addLast(problem);
        }
        for (int i = 0; i < countOfPeoples ; i++) {
            String name=reader.readLine();
            if (NameChecker(name)){
                peoples.add(name);
            }
        }
       while(!problems.isEmpty()) {
           if (peoples.size() == 1) {
               System.out.printf("%s gets the job!", peoples.peek());
               return;
           }
           int sumProb = 0;
           int sumPeop = 0;
           for (int i = 0; i < peoples.peekFirst().length(); i++) {
               sumPeop += (int)(peoples.peek().charAt(i));
           }
           for (int i = 0; i < problems.peekLast().length(); i++) {
               sumProb += (int)(problems.peekLast().charAt(i));
           }
           if (sumPeop > sumProb) {
               System.out.printf("%s solved %s.%n", peoples.peekFirst(), problems.peekLast());
               peoples.addLast(peoples.peekFirst());
               peoples.removeFirst();
               problems.removeLast();

           } else {
               System.out.printf("%s failed %s.%n", peoples.peekFirst(), problems.peekLast());
               problems.addFirst(problems.peekLast());
               problems.removeLast();
               peoples.removeFirst();

           }
       }
        System.out.println(String.join(", ",peoples));

    }


    private static boolean NameChecker(String name) throws IOException {
        while (true){
            Pattern pattern=Pattern.compile("^[A-Z][a-z]+ [A-Z][a-z]+$");
            Matcher matcher=pattern.matcher(name);
            if (matcher.matches()){
               return true;
            }
            return false;
        }
    }

}