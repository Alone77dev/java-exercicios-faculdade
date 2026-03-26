package javaimperativo.estruturarepeticao;

/*b) Faça usando o do while*/

import java.util.Scanner;

class LinhasDo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, cont, stop;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        cont = 1;
        stop = 1;

        do {
            if (cont % 5 == 0 || cont == num) {
                System.out.println(cont);
            } else {
                System.out.print(cont + ",");
            }

            if (cont % 10 == 0) {
                System.out.print("Digite 0 para parar ou qualquer num para continuar: ");
                stop = input.nextInt();
            }

            cont++;
        } while (cont <= num && stop != 0);


    }
}
