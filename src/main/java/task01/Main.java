package task01;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] arr1 = new int[random.nextInt(40)];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[random.nextInt(40)];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[random.nextInt(40)];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr3));

        int[][] sumArray = new int[3][];
        sumArray[0] = arr1;
        sumArray[1] = arr2;
        sumArray[2] = arr3;

        System.out.println(Arrays.deepToString(sumArray));
    }
}
