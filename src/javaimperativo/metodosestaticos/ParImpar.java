package javaimperativo.metodosestaticos;

/*Crie um método para determinar se um número
é ou não par (enquanto não for zero).
– Crie também dois métodos para mostrar mensagens...
– Baseado nos métodos print e println ...
– Chamados mostre e mostreln.*/

import java.util.Scanner;

class ParOuImpar {

    public static boolean ehPar(int num) {
        return num % 2 == 0;
    }

    public static void mostre(String msg) {
        System.out.print(msg);
    }

    public static void mostreln(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            mostre("Digite um número (0 para sair): ");
            num = input.nextInt();

            if (num != 0) {
                if (ehPar(num)) {
                    mostreln("O número é PAR.");
                } else {
                    mostreln("O número é ÍMPAR.");
                }
            }

        } while (num != 0);

        mostreln("Programa encerrado.");
    }
}
