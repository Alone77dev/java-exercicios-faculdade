package javaimperativo.metodosestaticos;

/* Leia três números (enquanto o primeiro não for zero) e
calcule o maior entre eles. Obs : Use apenas três
variáves e calcule o maior deles em apenas uma linha de
comando.*/

import java.util.Scanner;

class Maior3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Informe o 1º número: ");
        num1 = input.nextInt();

        while (num1 != 0) {

            System.out.print("Informe o 2º número: ");
            num2 = input.nextInt();

            System.out.print("Informe o 3º número: ");
            num3 = input.nextInt();

            System.out.println("Maior: " + Math.max(Math.max(num1, num2), num3));

            System.out.print("Informe o 1º número: ");
            num1 = input.nextInt();
        }
    }
}
