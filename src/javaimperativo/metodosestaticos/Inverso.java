package javaimperativo.metodosestaticos;

/*Leia um número (enquanto não for zero) e mostre o
inverso (1/x)*/

import java.util.Scanner;

class InversoMetodo {

    public static float inverso(float x) {
        return 1 / x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = 1;

        do {
            if (num != 0) {
                System.out.println("Informe um número: ");
                num = input.nextFloat();

                System.out.println("Inverso: " + inverso(num));
            }

        }
        while (num != 0);
    }
}
