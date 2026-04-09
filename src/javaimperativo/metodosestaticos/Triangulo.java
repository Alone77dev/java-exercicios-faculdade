package javaimperativo.metodosestaticos;

/*Leia três lados (enquanto o primeiro não for zero) e
informe se é um triângulo : Equilátero, Isósceles,
Escaleno ou Inválido.*/

import java.util.Scanner;

class Triangulo {

    public static void classT(float L1, float L2, float L3) {
        if (L1 == L2 && L2 == L3) {
            System.out.println("Triângulo Equilátero");
        } else if (L1 == L2 || L1 == L3 || L2 == L3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float lado1 = 1, lado2, lado3;

        do {
            if (lado1 != 0) {
                System.out.print("Informe o lado 1: ");
                lado1 = input.nextFloat();

                System.out.print("Informe o lado 2: ");
                lado2 = input.nextFloat();

                System.out.print("Informe o lado 3: \n");
                lado3 = input.nextFloat();

                classT(lado1, lado2, lado3);
            }
        }
        while (lado1 != 0);
    }
}

