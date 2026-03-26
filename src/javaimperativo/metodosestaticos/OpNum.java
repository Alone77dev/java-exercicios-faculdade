package javaimperativo.metodosestaticos;

/*Leia um número (enquanto não for zero) e
calcule
– o valor absoluto
– o cubo
– a raiz quadrada (se o número for
positivo)
– Não use IF*/

import java.util.Scanner;

class OpNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 1;
        String resultado;

        do {
            System.out.print("Informe um número (0 para sair): ");
            num = input.nextInt();
            if (num != 0) {
                System.out.println("Valor Absoluto: " + Math.abs(num));
                System.out.println("Ao Cubo: " + Math.pow(num, 3));
                resultado = (num < 0) ? "Número Negativo!!!" : "Raiz Quadrada: " + Math.sqrt(num);
                System.out.println(resultado);
                input.nextLine();
                System.out.println("-----------------------------");
            }
        }
        while (num != 0);

    }
}

