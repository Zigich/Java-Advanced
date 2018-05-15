package Intro_To_Java_Lab;

public class Lottery {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            for (int j = i; j <=9 ; j++) {
                for (int k = j; k <=8 ; k++) {
                    System.out.printf("%d %d %d%n",k,j,i);
                }
            }
        }
    }
}
