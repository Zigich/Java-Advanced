package String_Processing_Exercise;

        import java.text.DecimalFormat;
        import java.util.Scanner;

public class Unicode_Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input=scan.nextLine().split("");
        for (String s : input) {
            String unicode=Integer.toHexString(s.charAt(0));
            System.out.printf("\\u00%s",unicode);
        }

    }
}
