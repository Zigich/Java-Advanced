package String_Processing_Exercise;

import java.util.Scanner;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class Palindometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input=scan.nextLine().split("[?!.,\\s+]");
        Set<String> words=new TreeSet<>();
        String Debug="";
        for (String s : input) {

            if (palindometers(s)){
                words.add(s);
            }

        }
        if (words.contains("")){
            words.remove("");
        }
        System.out.println(words);
    }
    public static boolean palindometers (String word){
        String firstPart="";
        String secondPart="";
        if (word.length()%2==1){
            for (int i = 0; i < word.length()/2; i++) {
                firstPart+=word.charAt(i);
            }
            for (int i = (word.length()/2)+1; i <word.length() ; i++) {
                secondPart+=word.charAt(i);
            }
            if (firstPart.equals(secondPart)){
                return true;
            }
        }else {
            for (int i = 0; i < word.length()/2; i++) {
                firstPart+=word.charAt(i);
            }
            for (int i = word.length()/2; i <word.length() ; i++) {
                secondPart+=word.charAt(i);
            }
            if (firstPart.equals(secondPart)){
                return true;
            }
        }
        return false;
    }
}
