package task04;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        fillArrayWithRandomNumbers(array);

        sortRows(array);

        printArray(array);
    }

    private static void fillArrayWithRandomNumbers(int[][] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(100); // Losowe liczby z zakresu 0-99
            }
        }
    }

    private static void sortRows(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
    }

    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
