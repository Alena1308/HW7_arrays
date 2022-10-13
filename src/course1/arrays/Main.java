package course1.arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       runHomeWork1Task1();
       runHomeWork1Task2();
       runHomeWork1Task3();
       runHomeWork1Task4();
    }
    public static void runHomeWork1Task1() {
        //Объявите три массива:
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //Произвольный массив – тип и количество данных определите сами.
        //Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int [] arr1 = new int[3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;

        double [] arr2 = {1.57, 7.654, 9.986};

        int [] arr3 = {1, 2, 3, 4, 5, 6, 7};
    }
    public static void runHomeWork1Task2() {
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов,
        //начиная с первого элемента, через запятую. Запятая между последним элементом одного
        //массива и первым элементом следующего не нужна.
        System.out.println("Задание 2");
        int [] arr1 = new int[3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if (i != arr1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double [] arr2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if (i != arr2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] arr3 = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if (i != arr3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void runHomeWork1Task3() {
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого
        //элемента массива, а с последнего. Элементы должны быть распечатаны через запятую
        //при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        System.out.println("Задание 3");
        int [] arr1 = new int[3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;
        for (int i = arr1.length - 1; i >= 0 ; i--) {
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double [] arr2 = {1.57, 7.654, 9.986};
        for (int i = arr2.length - 1; i >= 0 ; i--) {
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] arr3 = {1, 2, 3, 4, 5, 6};
        for (int i = arr3.length - 1; i >= 0 ; i--) {
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void runHomeWork1Task4() {
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем
        //сделайте четными (нужно прибавить 1).
        //Важно: код должен работать с любым целочисленным массивом,
        //поэтому для решения задания вам нужно использовать циклы.
        //Распечатайте результат преобразования в консоль.
        System.out.println("Задание 4");
        int [] arr1 = new int[3];
        arr1 [0] = 1;
        arr1 [1] = 2;
        arr1 [2] = 3;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 != 0) {
                arr1 [i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr1)); //Не проходили этого, взяла из разбора ДЗ
    }
}
