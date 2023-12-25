package Task_1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Начальное значение: ");
        int seedNumber = scanner.nextInt();
        System.out.print("Длина массива: ");
        int length = scanner.nextInt();
        int[] numberPeople = new int[length];
        for (int i = 0; i < numberPeople.length; i++) {
            if (i == 0) {
                numberPeople[i] = (i + 3) * seedNumber;
            } else {
                numberPeople[i] = i * seedNumber;
            }
        }
        System.out.println("Произвольный массив = " + Arrays.toString(numberPeople));
    }
}
