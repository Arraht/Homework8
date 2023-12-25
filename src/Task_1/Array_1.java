package Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Длина целочисленного массива: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Значение " + i + "-го элемента = ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nЦелочисленный массив = " + Arrays.toString(numbers) + '\n');
    }
}