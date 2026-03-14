package estruturasdecisao;

/*Fazer um Menu para calcular : Adição, Subtração;
Multiplicação e Divisão (cuidado na divisão) de dois
números inteiros !*/

import java.util.Scanner;

class Operacoes {
    public static void main(String[] args) {

        short op;
        int resultado = 0, numOne, numTwo;
        Scanner input = new Scanner(System.in);

        System.out.println("---------Menu---------");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("----------------------");

        System.out.print("Informe uma Operação: ");
        op = input.nextShort();

        System.out.print("Informe um Número: ");
        numOne = input.nextInt();

        System.out.print("Informe outro Número: ");
        numTwo = input.nextInt();

        switch (op) {

            case 1:
                resultado = numOne + numTwo;
                break;
            case 2:
                resultado = numOne - numTwo;
                break;
            case 3:
                resultado = numOne * numTwo;
                break;
            case 4:
                if (numTwo != 0) {
                    resultado = numOne / numTwo;
                } else {
                    System.out.println("Dividor não pode ser 0");
                }
                break;
            default:
                System.out.println("Invalido");
        }

        if (op == 4) {
            if (numTwo != 0) {
                System.out.println("Resultado: " + resultado);
            }
        } else {
            System.out.println("Resultado: " + resultado);
        }


    }
}
