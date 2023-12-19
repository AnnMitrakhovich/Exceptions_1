package task0;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int min = 15;


        if (array.length <= min) {
            System.out.println("-1");
        } else {
            System.out.println(array.length);
        }
    }
}