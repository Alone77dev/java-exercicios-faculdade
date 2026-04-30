package poo.array.aluno;

import java.util.Scanner;

class AlunoProva {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a Quantidade Alunos: ");
        Aluno a[] = new Aluno[input.nextInt()];

        int maiorMedia = 0;
        int menorMedia = 0;
        float somaMedia = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = new Aluno();

            System.out.printf("-----Cadastro %dº Aluno-----\n", i + 1);
            System.out.print("Informe o Código: ");
            a[i].codigo = input.nextInt();
            input.nextLine();

            System.out.print("Informe o Nome: ");
            a[i].nome = input.nextLine();

            System.out.print("Informe a 1º nota: ");
            a[i].nota1 = input.nextFloat();

            System.out.print("Informe a 2º nota: ");
            a[i].nota2 = input.nextFloat();

            System.out.print("Informe a 3º nota: ");
            a[i].nota3 = input.nextFloat();

            somaMedia += a[i].media();

            if (i == 0 || a[i].media() > a[maiorMedia].media()) {
                maiorMedia = i;
            }

            if (i == 0 || a[i].media() < a[menorMedia].media()) {
                menorMedia = i;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.printf("-----%dº Aluno-----\n", i + 1);
            System.out.println("Código: " + a[i].codigo);
            System.out.println("Nome: " + a[i].nome);
            System.out.println("1º Nota: " + a[i].nota1);
            System.out.println("2º Nota: " + a[i].nota2);
            System.out.println("3º Nota: " + a[i].nota3);
            System.out.println("Média: " + a[i].media());
        }

        System.out.println("----------------------------");
        System.out.println("Média Turma: " + somaMedia / a.length);
        System.out.println("O Aluno com Maior Média foi " + a[maiorMedia].nome + " com " + a[maiorMedia].media());
        System.out.println("O Aluno com Menor Média foi " + a[menorMedia].nome + " com " + a[menorMedia].media());
    }
}
