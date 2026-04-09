package javaimperativo.metodosestaticos;

/* Leia um número (enquanto não for zero) e
mostre se é ou não primo.*/

import java.util.Scanner;

class PrimoMetodo {
    public static boolean ehPrimo(int num) {
        int div = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        return div == 2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

        do {
            System.out.print("Informe um número: ");
            num = input.nextInt();

            if (num != 0) {
                if (ehPrimo(num)) {
                    System.out.println("Primo!!");
                } else {
                    System.out.println("Não é Primo!!!");
                }
            }
        }
        while (num != 0);

        System.out.print("Programa Encerrado!!");
    }
}
