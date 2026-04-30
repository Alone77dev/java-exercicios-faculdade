package javaimperativo.metodosestaticos;

/*Leia um número (enquanto não for zero) e calcule a
raiz quarta
• 4v(x)*/

import java.util.Scanner;

class Raiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        double resultado;

        do {
            System.out.println("Informe um número: ");
            num = input.nextInt();

            resultado = Math.sqrt(Math.sqrt(num));

            System.out.println("Resultado: " + resultado);
        }
        while (num != 0);
    }
}
