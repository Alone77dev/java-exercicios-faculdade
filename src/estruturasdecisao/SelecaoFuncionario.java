package estruturasdecisao;

/*Uma empresa está contratando novos funcionários.
Peça o nome do candidato e sua idade. Para ser
aprovado deve ter idade entre 25 e 30 anos (homens) e
entre 18 e 25 (mulheres).*/

import java.util.Scanner;

class SelecaoFuncionario {

    public static void main(String[] args) {

        char sexo;
        String nome;
        short idade;

        Scanner input = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        nome = input.nextLine();

        System.out.print("Informe seu Sexo(M ou F): ");
        sexo = input.next().charAt(0);

        System.out.print("Informe sua Idade: ");
        idade = input.nextShort();

        if (sexo == 'M' || sexo == 'm') {
            if (idade > 24 && idade <= 31) {
                System.out.println("Aprovado!!");
            } else {
                System.out.println("Reprovado!!");
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade > 17 && idade <= 25) {
                System.out.println("Aprovada!!");
            } else {
                System.out.println("Reprovada!!");
            }
        }
    }
}

