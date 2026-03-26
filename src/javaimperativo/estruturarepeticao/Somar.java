package javaimperativo.estruturarepeticao;

/*Pedir e somar vários números enquanto não digitarem
0 (Zero).
 a) Mostrar assim : “A soma dos x números é 464”
 b) Mostrar a soma parcial
 c) Informar quantos números foram digitados
 d) Média Aritmética*/

import java.util.Scanner;

class Somar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = 0, mediaA, soma = 0;
        int cont = 0;


        do {
            System.out.print("Informe um número: ");
            num = input.nextFloat();

            soma += num;

            System.out.println("Resultado Parcial: " + soma);

            if (num != 0) {
                cont++;
            }
        } while (num != 0);

        mediaA = soma / cont;

        System.out.println("A soma dos " + cont + " números é: " + soma);
        System.out.println("Números Digitados: " + cont);
        System.out.println("Média Aritmétrica: " + mediaA);
    }
}

