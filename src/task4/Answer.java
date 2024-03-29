package task4;

import java.util.Arrays;

class Answer {
    public int[] divArrays(int[] a, int[] b) {
        // Введите свое решение ниже
        if (a.length != b.length) {
            int[] result = {0};
            return result;
        } else {
            int[] result = new int[a.length];
            for (int i = 0; i < result.length; i++) {
                if (b[i] == 0) {
                    throw new RuntimeException();
                } else {

                    result[i] = a[i] / b[i];
                }
            }
            return result;
        }

    }


    // Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
    public class Printer {
        public static void main(String[] args) {
            int[] a = {};
            int[] b = {};

            if (args.length == 0) {
                // При отправке кода на Выполнение, вы можете варьировать эти параметры
                a = new int[]{4, 5, 6};
                b = new int[]{1, 2, 3};
            } else {
                a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
                b = Arrays.stream(args[1].split(", ")).mapToInt(Integer::parseInt).toArray();
            }

            Answer ans = new Answer();
            String itresume_res = Arrays.toString(ans.divArrays(a, b));
            System.out.println(itresume_res);
        }

    }
}
