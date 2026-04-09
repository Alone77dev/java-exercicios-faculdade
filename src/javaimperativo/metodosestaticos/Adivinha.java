package javaimperativo.metodosestaticos;

/*) Faça um programa que use um método com cálculo
randômico.*/

import java.util.Scanner;
import java.util.Random;

class Adivinha {

    public static int gerarNumero() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSecreto = gerarNumero();
        int palpite = 0;

        System.out.println("Tente Adivinhar um número entre 1 e 100!!");

        while (palpite != numeroSecreto) {
            System.out.print("Informe um número: ");
            palpite = input.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("Alto!!");
            } else if (palpite < numeroSecreto) {
                System.out.println("Baixo!!");
            } else {
                System.out.println("Você Acertou!!!");
            }
        }

        System.out.println("Programa Finalizado!!");
    }
}
