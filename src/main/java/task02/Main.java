package task02;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        int[][] arr = new int[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Array:");
        for (int[] row : arr) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] == arr[i][arr.length - 1 - i]) {
                count++;
            }
        }
        if (count >= 3) {
            System.out.println("There are at least 3 same numbers on the diagonals of the array.");
        } else {
            System.out.println("There are less than 3 same numbers on the diagonals of the array.");
        }
    }
}
