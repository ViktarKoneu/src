package FiboFacto;

import java.util.Arrays;

import static FiboFacto.Logik.*;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        int algorithmId = 1;
        int loopType = 2;
        int n = 12;
        int[] dimm = Logik.logikSide(algorithmId, loopType, n);
        out.println(Arrays.toString(dimm));
    }
}

class FactoryMethod1 {
    int[] factory1( int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 1;
        int i = 1;
        while (n > i) {
            fiboarr[i] = fiboarr[i - 1] * i;
            i++;
        }
        return fiboarr;
    }
}

class FactoryMethod2 {
    int[] factory2(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 1;
        int i = 1;
        do {
            fiboarr[i] = fiboarr[i - 1] * i;
            i++;
        } while ((n > i));
        return fiboarr;
    }
}

class FactoryMethod3 {
    int[] factory3(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 1;
        for (int i = 1; i < n; i++) {
            fiboarr[i] = fiboarr[i - 1] * i;
        }
        return fiboarr;
    }
}

class FibonacciMethod1 {
    int[] fibonacci1(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        int i = 2;
        while (n > i) {
            fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
            i++;
        }
        return fiboarr;
    }
}

class FibonacciMethod2 {
    int[] fibonacci2(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        int i = 2;
        do {
            fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
            i++;
        } while ((n > i));
        return fiboarr;
    }
}

class FibonacciMethod3 {
    int[] fibonacci3(int n) {
        int[] fiboarr = new int[n];
        fiboarr[0] = 0;
        fiboarr[1] = 1;
        for (int i = 2; i < n; i++) {
            fiboarr[i] = fiboarr[i - 1] + fiboarr[i - 2];
        }
        return fiboarr;
    }
}
 /* Написать программу, которая принимает на вход три целых числа:
        1_+. algorithmId - тип алгоритма
        1. вычисление ряда чисел Фибоначчи;
        2. вычисление факториала
        2_+. loopType - тип циклов, которые нужно использовать:
        1. цикл while
        2. цикл do-while
        3. цикл for
        3. +n - параметр, передаваемый в алгоритм.

        К примеру, если передаются числа “1 3 5”, программе необходимо вывести на экран первые 5 чисел Фибоначчи и при вычислении использовать цикл for.
        К примеру, если передаются числа “2 1 7”, программе необходимо вывести на экран факториал числа 7 и при его вычислении использовать цикл while.
        Числа Фибоначчи начинаются с нуля: 0 1 1 2 3 5 ...*/