package task4;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {5, null, 8, 90, null, null, 9};
        checkArray(array);


    }
    public static void checkArray (Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                System.out.printf("значение пусто под индексом %d \n", i);
            }
        }
    }
}
