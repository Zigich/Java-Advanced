package Intro_To_Java_Exercise;

import java.util.Scanner;

public class Character_Multipiler {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);

      String firstWord=scan.next();
      String secondWord=scan.next();
      int result=0;
      int sum = 0;



        for (int i = 0; i <Math.min(firstWord.length(),secondWord.length()) ; i++) {
            result=firstWord.charAt(i)*secondWord.charAt(i);
            sum+=result;
        }

        String leastChar="";
      if (firstWord.length()<=secondWord.length()){
            leastChar=secondWord.substring(firstWord.length());
      }else {
           leastChar=firstWord.substring(secondWord.length());
      }


        for (int i = 0; i < leastChar.length(); i++) {
            sum+=leastChar.charAt(i);
        }

        System.out.println(sum);
    }
}
