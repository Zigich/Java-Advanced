package String_Processing_Exercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match_Phone_Number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true){
            String input=scan.nextLine();
            if ("end".equals(input)){
                return;
            }
            Pattern pattern=Pattern.compile("\\+359([ -])2\\1\\d{3} \\d{4}");
            Matcher matcher=pattern.matcher(input);
            if (matcher.find()){
                System.out.println(matcher.group(0));
            }
        }
    }
}
