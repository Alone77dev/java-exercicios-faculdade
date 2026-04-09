package javaimperativo.metodosestaticos;

/* Calcule o fatorial de um número
– Crie um método normal
– Crie um método recursivo*/

import java.util.Scanner;

class Fatorial {

    public static int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }

    public static int fatorialRec(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fatorialRec(num - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um Número: ");
        num = input.nextInt();

        System.out.println("Fatorial: " + fatorial(num));

        System.out.println("Fatorial com recursão: " + fatorialRec(num));
    }
}

