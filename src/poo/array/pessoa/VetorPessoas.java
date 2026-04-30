package poo.array.pessoa;

import java.util.Scanner;

class VetorPessoas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa person[] = new Pessoa[3];

        for (int i = 0; i < person.length; i++) {
            person[i] = new Pessoa();

            System.out.printf("Informe o nome da %d%c: ", i + 1, 178);
            person[i].name = input.nextLine();

            System.out.printf("Informe a idade da %d%c: ", i + 1, 178);
            person[i].age = input.nextInt();

            input.nextLine();
        }

        System.out.println("\n--- Lista de Pessoas---");

        for (int i = 0; i < person.length; i++) {
            System.out.printf("%d%c Pessoa: \n", i + 1, 178);
            System.out.println("Nome: " + person[i].name);
            System.out.println("Idade: " + person[i].age);
        }
    }
}
