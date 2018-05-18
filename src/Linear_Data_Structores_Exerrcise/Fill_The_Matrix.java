package Linear_Data_Structores_Exerrcise;

import java.util.Scanner;

public class Fill_The_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split(",\\s+");
        int size = Integer.parseInt(commands[0]);
        String pattern = commands[1];
        int[][] matrix = new int[size][size];
        int counter = 1;

        if (pattern.equalsIgnoreCase("a")) {
            patternA(size, matrix, counter);
        } else if (pattern.equalsIgnoreCase("b")) {
            patternB(size, matrix, counter);
        }

        printMatrix(matrix);

    }

    static void printMatrix(int[][] matrix) {
        for (int a = 0; a < matrix.length; a++) {
            for (int b = 0; b < matrix[0].length; b++) {
                System.out.print(matrix[a][b] + " ");
            }
            System.out.println();
        }
    }

    private static void patternB(int size, int[][] matrix, int counter) {
        for (int cols = 0; cols < size; cols++) {
            if (cols % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][cols] = counter;
                    counter++;
                }

            } else {
                for (int rows = size - 1; rows >= 0; rows--) {
                    matrix[rows][cols] = counter;
                    counter++;
                }
            }
        }
    }

    private static void patternA(int size, int[][] matrix, int counter) {
        for (int col = 0; col < size; col++) {

            for (int row = 0; row < size; row++) {
                matrix[row][col] = counter;
                counter++;
            }

        }
    }
}
