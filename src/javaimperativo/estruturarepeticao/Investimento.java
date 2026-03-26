package javaimperativo.estruturarepeticao;

/*Leia o valor do investimento p de uma pessoa em
uma conta poupança, e a taxa de juros r anual (em
%). Assumindo que todo o juro é deixado em
depósito, calcule e mostre a quantidade de dinheiro a
na conta no fim de cada ano durante n anos ( n
será lido).
– Fórmula : a = p (1 + r) n
– a : quantidade em depósito no fim do n-ésimo ano
– p : quantidade original investida
– r : taxa de juros anual
– n : número de ano
– XY= Math.pow (x,y)*/

import java.util.Scanner;

class Investimento {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float p, r;
        int n;
        double a;

        System.out.print("Informe seu Investimento: ");
        p = input.nextFloat();

        System.out.print("Juros anual(em %): ");
        r = input.nextFloat();

        System.out.print("Tempo: ");
        n = input.nextInt();

        for (int i = 0; i <= n; i++) {
            a = (p * Math.pow(1 + r / 100f, i));

            System.out.println("\nMontante no ano " + i + " = " + a);

        }


    }
}
