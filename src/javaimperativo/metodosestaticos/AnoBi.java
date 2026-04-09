package javaimperativo.metodosestaticos;

/* Leia um ano (enquanto não for zero) e informe se é ou
não Bissexto.*/

import java.util.Scanner;

class AnoBi {

    public static boolean bissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ano = 1;
        do {
            if (ano != 0) {
                System.out.print("Informe o ano: ");
                ano = input.nextInt();

                if (bissexto(ano)) {
                    System.out.println("Ano Bissexto!!");
                } else {
                    System.out.println("Não Bissexto!!");
                }
            }
        }
        while (ano != 0);

        System.out.print("Programa Finalizada!!!");
    }
}
