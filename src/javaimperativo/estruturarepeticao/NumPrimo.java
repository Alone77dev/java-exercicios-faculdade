package javaimperativo.estruturarepeticao;

/*Determine se um número inteiro é ou não primo. Sair
com zero. Um número é primo se é divisível apenas por
um e por ele mesmo.*/

import java.util.Scanner;

class NumPrimo {

    public static void main(String[] args) {
        int num = 0, div;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Informe um número: ");
            num = input.nextInt();

            div = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    div++;
                }
            }

            if (num != 0) {
                if (div == 2) {
                    System.out.println("Primo!!");
                } else {
                    System.out.println("Não é Primo!!");
                }
            } else {
                System.out.println("Você saiu!!");
            }
        } while (num != 0);
    }
}
