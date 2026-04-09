package javaimperativo.metodosestaticos;

import java.util.Scanner;

public class Fibonacci {

    public static void fibonacciIterativo(int n) {
        int a = 0, b = 1;

        System.out.print("Iterativo: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println();
    }

    public static int fibonacciRecursivo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos: ");
        int n = input.nextInt();

        fibonacciIterativo(n);

        System.out.print("Recursivo: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }
}
