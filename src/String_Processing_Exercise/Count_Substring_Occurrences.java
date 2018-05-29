package String_Processing_Exercise;

import java.util.Scanner;

public class Count_Substring_Occurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input=scan.nextLine().toLowerCase();
        String word=scan.nextLine();
        int wordCounter=0;
        String Debug="";
        for (int i = 0; i <input.length() ; i++) {
            if (input.toLowerCase().contains(word)){

                wordCounter++;
                input=input.replaceFirst(word, "*");

            }
        }
        System.out.println(wordCounter);

    }
}
