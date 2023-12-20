package task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {5, null, 9};
        checkArray(array);
        checkAndMarkAndPrint(array);


    }
    public static void checkArray (Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.printf("значение пусто под индексом %d \n", i);
            }
        }
    }

    public static ArrayList<Integer> checkAndMark (Integer[] array) {
        ArrayList<Integer> listOfNull = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                listOfNull.add(i);
            }
        }
        return listOfNull;
    }

    public static void checkAndMarkAndPrint (Integer[] array) {
        ArrayList<Integer> listOfNull = checkAndMark(array);
        if (listOfNull.size() == 0)
            System.out.println("Пустых ячеек не обнаружено");
        else System.out.println(listOfNull);
    }
}
