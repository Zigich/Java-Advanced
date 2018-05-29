package String_Processing_Exercise;

import java.util.Scanner;

public class Text_Filter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] bannedWords=scan.nextLine().split(", ");
        String rawInput= scan.nextLine();
        String debug="";
        for (int i = 0; i <rawInput.length() ; i++) {
            for (String bannedWord : bannedWords) {
                if (rawInput.contains(bannedWord)){
                    rawInput=rawInput.replaceFirst(bannedWord,counterOfStars(bannedWord));
                }
            }
        }
        System.out.println(rawInput);
    }
    public static String counterOfStars (String word){
        String counter="";
        for (int i = 0; i < word.length() ; i++) {
            counter+="*";
        }
        return counter;
    }
}
