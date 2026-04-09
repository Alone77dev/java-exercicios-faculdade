package javaimperativo.metodosestaticos;

/* Leia o valor do investimento (p) de uma pessoa
(enquanto não for digitado zero) em uma conta
poupança, e a taxa de juros (r) mensal (em %), a
quantidade de meses (n) e crie um método que
calcule e retorne o montante (a).
Fórmula : a = p (1 + r)^n
*/

import java.util.Scanner;

class InvestimentoMetodo {

    public static double montante(double invest, double juros, int meses) {
        return invest * Math.pow(1 + juros / 100, meses);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double invest = 1, juros;
        int meses;

        do {
            if (invest != 0) {
                System.out.print("\nInforme o investimento (0 para sair): ");
                invest = input.nextDouble();

                System.out.print("Informe o Juros (em %): ");
                juros = input.nextDouble();

                System.out.print("Informe o Tempo (em meses): ");
                meses = input.nextInt();

                System.out.println("\nMontante: " + montante(invest, juros, meses));
            }

        } while (invest != 0);

    }
}
