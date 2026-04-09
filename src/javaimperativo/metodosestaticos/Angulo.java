package javaimperativo.metodosestaticos;

/*Leia um ângulo (enquanto não for zero) e calcule o
seno, cosseno e tangente. (valores em radianos)
*/

import java.util.Scanner;

class Angulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double ang = 1, rad, seno, cosseno, tangente;

        while (ang != 0) {
            System.out.print("Informe o Ângulo (0 para Sair): ");
            ang = input.nextDouble();

            rad = Math.toRadians(ang);

            seno = Math.sin(rad);
            cosseno = Math.cos(rad);
            tangente = Math.tan(rad);

            if (ang != 0) {
                System.out.println("Seno: " + seno);
                System.out.println("Cosseno: " + cosseno);
                System.out.println("Tangente: " + tangente);
            }
        }
    }
}
