/*Faça um programa que leia o nome, o peso e a
altura. Calcule o peso ideal para homem e para
mulher, conforme a fórmula abaixo:
Homem : (72.7 * altura ) - 58.00
*/
package javaimperativo.entradasaida;

import java.util.Scanner;

class PesoIdeal {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;
        char sexo;
        float peso, altura, pesoIdeal;

        System.out.print("Informe seu nome: ");
        nome = teclado.nextLine();

        System.out.print("Informe seu sexo (M para homem / F para mulher): ");
        sexo = teclado.next().charAt(0);

        System.out.print("Informe seu peso: ");
        peso = teclado.nextFloat();

        System.out.print("Informe sua altura: ");
        altura = teclado.nextFloat();

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (float) ((72.7 * altura) - 58.0);
        } else {
            pesoIdeal = (float) ((62.1 * altura) - 44.7);
        }

        System.out.println("\nNome: " + nome);
        System.out.println("Peso atual: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Peso ideal: " + pesoIdeal);

        teclado.close();
    }
}
