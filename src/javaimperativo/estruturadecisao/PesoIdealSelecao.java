package javaimperativo.estruturadecisao;

/*Altere o 5º exercício proposto (entrada e
saída) lendo agora o sexo da pessoa e
mostrando qual a sua altura ideal, dependendo
da fórmula. Informe também se está abaixo ou
acima do peso e em quantos kilogramas.*/

import java.util.Scanner;

class PesoIdealSelecao {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nome;
        char sexo;
        float peso, altura, pesoIdeal;

        System.out.print("Informe seu nome: ");
        nome = input.nextLine();

        System.out.print("Informe seu sexo (M para homem / F para mulher): ");
        sexo = input.next().charAt(0);

        System.out.print("Informe seu peso: ");
        peso = input.nextFloat();

        System.out.print("Informe sua altura: ");
        altura = input.nextFloat();

        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (float) ((72.7 * altura) - 58.0);
        } else {
            pesoIdeal = (float) ((62.1 * altura) - 44.7);
        }

        System.out.println("\nNome: " + nome);
        System.out.println("Peso atual: " + peso);
        System.out.println("Altura: " + altura);
        if (pesoIdeal > peso) {
            System.out.println("Peso ideal: " + pesoIdeal + "\nVocê está Abaixo dele!!");
        } else {
            System.out.println("Peso ideal: " + pesoIdeal);
        }

        input.close();

    }
}