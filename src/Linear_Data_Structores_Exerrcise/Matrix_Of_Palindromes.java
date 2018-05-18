package Linear_Data_Structores_Exerrcise;

import java.util.Scanner;

public class Matrix_Of_Palindromes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input=scan.nextLine().split("\\s+");
        int rows=Integer.parseInt(input[0]);
        int cols=Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];
        for(int i = 0; i < rows; i++) {
            for(int j =0; j < cols; j++) {

                matrix[i][j] = (char)('a'+i)+""+(char)('a'+j+i)+""+(char)('a'+i);
            }

        }

        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }
}
