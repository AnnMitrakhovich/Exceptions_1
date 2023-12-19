package task1;

import java.util.Random;

public class ArrayOperation {
    public int[] setArray(int len) {
        int[] array = new int[len];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6);
        }
        return array;
    }

    public int getCode(int[] array, int number) {
        if (array == null) {
            return -3;
        }
        if (number > array.length) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }

        }
        return -2;
    }

    public void infoCode(int code) {
        if (code == -1)
            System.out.println("длина массива меньше числа");
        else if (code == -2)
            System.out.println("числа в массиве нет");
        else if (code == -3)
            System.out.println("массив пустой");
        else
            System.out.printf("Элемент найден под индексом %d", code);
    }
}

