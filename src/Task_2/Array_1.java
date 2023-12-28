package Task_2;

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
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.println();
    }
}