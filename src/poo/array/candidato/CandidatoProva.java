package poo.array.candidato;

import java.util.Scanner;

class CandidatoProva {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Número de Candidatos: ");
        int n = input.nextInt();
        Candidato c[] = new Candidato[n];

        int somaVotos = 0;
        int indiceMaior = 0;
        int minVotos = 0;

        System.out.print("Informe o número de Votos Mínimos: ");
        minVotos = input.nextInt();

        for (int i = 0; i < c.length; i++) {
            c[i] = new Candidato();

            System.out.printf("-------Cadastro %dº Candidato-------\n", i + 1);
            System.out.print("Informe o Número do Candidato: ");
            c[i].numero = input.nextInt();
            input.nextLine();

            System.out.print("Informe o Nome do Candidato: ");
            c[i].nome = input.nextLine();

            System.out.print("Informe o Número de Votos do Candidato: ");
            c[i].votos = input.nextInt();

            somaVotos += c[i].votos;

            if (i == 0 || c[i].votos > c[indiceMaior].votos) {
                indiceMaior = i;
            }
        }

        for (int i = 0; i < c.length; i++) {
            c[i].mostrarDados(i, minVotos);
        }
        System.out.println("------------------------");
        System.out.println("Soma Votos: " + somaVotos);
        System.out.println("Média dos Votos: " + (somaVotos / n));
        System.out.println("Mais votado " + c[indiceMaior].nome + " com " + c[indiceMaior].votos + " votos");
    }
}
