package EXAM;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque<String> input= new ArrayDeque<String>();
        int sum=0;
        for (int i = 0; i <3 ; i++) {
            String is=reader.readLine();
            input.add(is);

            for (int j = 0; j <input.pop().length()-1 ; j++) {
                char chara= input.pop().charAt(i);
                System.out.println(chara);
            }
        }
        System.out.println(input.peek().length());
    }
}
