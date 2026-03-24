package estruturarepeticao;

/*Leia n e mostre os números de 1 a n.
– Obs :
– Mostre apenas 5 números por linha.
– O último termo da linha não é seguido de vírgula.
– Ao final de cada bloco de 10, informe que usuário
pode digitar zero para parar a seqüência.
– Exemplo : n = 10
– [1,2,3,4,5]
– [6,7,8,9,10]
– a) Faça usando o while
– b) Faça usando o do while*/

import java.util.Scanner;

class LinhasI {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num, cont, stop;


        System.out.print("Digite um número: ");
        num = input.nextInt();

        cont = 1;
        stop = 1;
        while (cont <= num && stop != 0) {
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
        }


    }
}
