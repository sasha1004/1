package ru.skypro;

import java.util.Arrays;

public class Massive1 {
    public static void main(String[] args) {
//Объявите три массива:
//
//1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
//    - Подсказка
//
//        ```java
//        //объявление массива из 12-ти элементов, заполненного нулями
//
//        int [] weight = new int [12];
//        ```
//
//2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
//    - Подсказка
//
//        ```java
//        //объявление целочисленного массива, заполненного 12 элементами
//
//        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
//        ```
//
//3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;

        double[] weight2 = {1.57, 7.654};

        boolean[] weight3 = {false, true, false};

        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //
        //- **Критерии оценки**
        //    - В консоль выведены все элементы первого массива в верном порядке через запятую
        //    - В консоль выведены все элементы второго массива в верном порядке через запятую
        //    - В консоль выведены все элементы третьего массива в верном порядке через запятую
        //    - На одной строчке расположены элементы только одного массива


        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        //
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //
        //Если во втором задании в консоль у вас вывелся результат
        //1, 2, 3
        //
        //1.57, 7.654, 9.986
        //
        //*произвольные элементы третьего массива*
        //
        //То в третьем задании результат должен быть
        //
        // 3, 2, 1
        //
        //9.986, 7.654, 1.57
        //
        //*произвольные элементы третьего массива в обратном порядке*

        //        int [] weight = new int [3];
        //        weight[0] = 1;
        //        weight[1] = 2;
        //        weight[2] = 3;

        for (int i = 0; i < weight.length; i++) {
            if (i < weight.length - 1)
                System.out.print(weight[i] + ",");
            else
                System.out.print(weight[i]);
        }

        System.out.println();
        for (int i = 0; i < weight2.length; i++) {
            if (i < weight2.length - 1)
                System.out.print(weight2[i] + ",");
            else
                System.out.print(weight2[i]);
        }
        System.out.println();
        for (int i = 0; i < weight3.length; i++) {
            if (i < weight3.length - 1)
                System.out.print(weight3[i] + ",");
            else
                System.out.print(weight3[i]);
        }

        System.out.println("------2 Задача -------");
        for (int i = weight.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(weight[i] + ",");
            else if (i == 0)
                System.out.println(weight[i]);

        }
        System.out.println();
        for (int i = weight2.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(weight2[i] + ",");
            else if (i == 0)
                System.out.println(weight2[i]);

        }
        System.out.println();
        for (int i = weight3.length - 1; i >= 0; i--) {
            if (i > 0)
                System.out.print(weight3[i] + ",");
            else if (i == 0)
                System.out.println(weight3[i]);

        }

        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //
        //Распечатайте результат преобразования в консоль.
        //
        //- Критерии оценки
        //    - Все нечетные числа в целочисленном массиве четные с помоущью прибавления 1
        //    - В консоли распечатан только целочисленный массив


        //        //        int [] weight = new int [3];
        //        //        weight[0] = 1 ->2;
        //        //        weight[1] = 2 ->2;
        //        //        weight[2] = 3 ->4;

        for (int i = 0; i < weight.length; i++) {
            if (weight[i] % 2 == 1)
                weight[i]++;

            if (i < weight.length - 1)
                System.out.print(weight[i] + ",");
            else
                System.out.print(weight[i]);

        }
        System.out.println();
        for (int i = weight.length - 1; i >= 0; i--) {
            if (weight[i] % 2 == 1)
                weight[i]++;

            if (i != 0)
                System.out.print(weight[i] + ",");
            else
                System.out.print(weight[i]);

        }

        String new_string = Arrays.toString(weight);

        System.out.println(new_string);

        for (int i = 1; i < new_string.length() - 1; i++)
            System.out.print(new_string.charAt(i));


        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        double[] arr2 = {1.57, 7.654, 9.986};

        int[] arr3 = new int[2];
        arr3[0] = 4;
        arr3[1] = 5;
//task2
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i]);
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (j < arr2.length - 1) {
                System.out.print(arr2[j] + ", ");
            } else {
                System.out.println(arr2[j]);
            }
        }
        for (int d = 0; d < arr3.length; d++) {
            if (d < arr3.length - 1) {
                System.out.print(arr3[d] + ", ");
            } else {
                System.out.println(arr3[d]);
            }
        }
//task3
        for (int k = arr.length - 1; k >= 0; k--) {
            if (k > 0) {
                System.out.print(arr[k] + ", ");
            } else {
                System.out.println(arr[k]);
            }
        }
        for (int l = arr2.length - 1; l >= 0; l--) {
            if (l > 0) {
                System.out.print(arr2[l] + ", ");
            } else {
                System.out.println(arr2[l]);
            }
        }
        for (int s = arr3.length - 1; s >= 0; s--) {
            if (s > 0) {
                System.out.print(arr3[s] + ", ");
            } else {
                System.out.println(arr3[s]);
            }
        }
//task4
        for (int c = 0; c < arr.length; c++) {
            if (arr[c] % 2 != 0) {
                arr[c] = arr[c] + 1;
            }
            System.out.print(arr[c] + " ");
        }


        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12, 16}};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                System.out.println(a[i][j]);

    }


}


