package javaimperativo.estruturarepeticao;

/* Leia um número entre 0 e 9 e mostre todos os
números que contém este número lido no intervalo
de 0 a 99.*/

import java.util.Scanner;

class Intervalo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Informe um número: ");
        num = input.nextInt();

        for (int i = 0; i < 100; i++) {
            String numStr = String.valueOf(i);

            if (numStr.contains(String.valueOf(num))) {
                System.out.println(i);
            }
        }
    }
}
