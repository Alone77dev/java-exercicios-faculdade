package javaimperativo.estruturadecisao;

import java.util.Scanner;

class Media {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Cadastro:");
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.print("Digite sua Idade: ");
        short idade = input.nextShort();
        System.out.print("Informe sua 1 nota:");
        float nota1 = input.nextFloat();
        System.out.print("Informe sua 2 nota:");
        float nota2 = input.nextFloat();
        float media = (nota1 + nota2) / 2;
        System.out.println("-----------------");
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota 1: " + nota1 + " Nota 2: " + nota2 + " Média: " + media);

        if (media >= 7) {
            System.out.println("Aprovado!!!!");
        } else {
            System.out.println("Reprrovado!!");
        }
    }
}
