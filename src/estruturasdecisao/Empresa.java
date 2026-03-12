package estruturasdecisao;

/*Calcule o lucro para a empresa ABC, mostrando se
houve lucro, prejuízo.*/

import java.util.Scanner;

class Empresa {
    public static void main(String[] args) {
        double ganhos, despesas, lucro;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe os Ganhos: ");
        ganhos = input.nextDouble();
        System.out.print("Informe as Despesas: ");
        despesas = input.nextDouble();

        lucro = ganhos - despesas;

        if (lucro > 0) {
            System.out.println("Lucro: " + lucro);
        } else {
            System.out.println("Prejuízo: " + lucro);
        }


    }
}