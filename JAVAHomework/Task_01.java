// 1. Написать метод, принимающий на вход два аргумента: len и initialValue, и 
// возвращающий одномерный массив типа int длиной len, каждая ячейка 
// которого равна initialValue;

package JAVAHomework;

import java.util.Scanner;
import java.util.Arrays;

public class Task_01 {
    public static void main(String[] args) {

        Scanner f = new Scanner(System.in);

        System.out.printf("Введите длину массива: ");

        Integer len = f.nextInt();

        System.out.printf("Введите число для массива: ");

        Integer initialValue = f.nextInt();

        int[] result = ArrayLen(len, initialValue);

        System.out.println(Arrays.toString(result));

        f.close();
    }

    private static int[] ArrayLen(int len, int initialValue) {

        int[] array = new int[len];

        for (int i = 0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
        
    }
}