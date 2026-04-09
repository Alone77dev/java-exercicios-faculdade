package javaimperativo.metodosestaticos;

/*Mostre os primos entre 1 e N
– N será lido
– Crie também um método void para mostrá-los
– Sair quando N for zero
*/

import java.util.Scanner;

class MostrePrimo {

    public static boolean ehPrimo(int num) {
        int div = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                div++;
            }
        }
        return div == 2;
    }

    public static void imprime(int num) {
        for (int i = 0; i <= num; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 1;
        do {
            if (n != 0) {
                System.out.print("Informe um número: ");
                n = input.nextInt();

                imprime(n);
            }


        }
        while (n != 0);

        System.out.println("Programa Finalizado");
    }
}
