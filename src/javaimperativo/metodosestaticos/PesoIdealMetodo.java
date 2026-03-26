package javaimperativo.metodosestaticos;

/* Faça um programa que leia o nome (enquanto não
for SAIR), o sexo, o peso e a altura. Crie um único
método que calcule e devolva o peso ideal conforme
a fórmula abaixo:
 · Homem : (72.7 * altura ) - 58.00
 · Mulher : (62.10 * altura ) - 44.70
 Após a devolução do cálculo informe o peso ideal e :
 · Parabéns : peso ideal
 · Acima do peso em x Kilos
 · Abaixo do peso em x Kilos
 Este valor de "x" (a diferença) não pode aparecer
negativo (use um método para isto).*/

import java.util.Scanner;

class PesoIdealMetodo {

    public static float pesoIdeal(char sexo, float altura) {
        float peso;
        if (sexo == 'M' || sexo == 'm') {
            peso = (float) ((72.7 * altura) - 58.0);
        } else {
            peso = (float) ((62.1 * altura) - 44.7);
        }
        return peso;
    }

    public static float convNegativo(float valor) {
        return Math.abs(valor);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        char sexo;
        float peso, altura, ideal, valor;
        int op = 1;

        while (op != 0) {
            System.out.print("Informe seu nome: ");
            nome = input.nextLine();

            if (nome.equalsIgnoreCase("SAIR")) {
                op = 0;
            } else {
                System.out.print("Informe seu sexo (M ou F): ");
                sexo = input.next().charAt(0);

                System.out.print("Informe seu peso: ");
                peso = input.nextFloat();

                System.out.print("Informe sua altura: ");
                altura = input.nextFloat();

                input.nextLine();

                ideal = pesoIdeal(sexo, altura);
                valor = convNegativo(peso - ideal);

                System.out.println("Peso Ideal: " + ideal);

                if (ideal == peso) {
                    System.out.println("Parabéns pelo Peso Ideal");
                } else if (peso > ideal) {
                    System.out.println("Acima do Peso em " + valor + "kg");
                } else {
                    System.out.println("Abaixo do Peso em " + valor + "kg");
                }

                System.out.println("---------------------------------------");
            }


        }


    }
}

