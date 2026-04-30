package poo.pessoa;

/* Leia a altura de duas pessoas e
mostre o nome do mais alto e o valor
da diferença. */

import java.util.Scanner;

class Altura {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Scanner input = new Scanner(System.in);


        System.out.print("Informe 1 nome: ");
        p1.name= input.nextLine();
        System.out.print("Informe a Altura: ");
        p1.height = input.nextFloat();

        input.nextLine();

        System.out.print("Informe 2 nome: ");
        p2.name = input.nextLine();
        System.out.print("Informe a Altura: ");
        p2.height = input.nextFloat();

        if (p1.height > p2.height){
            System.out.println(p1.name+" é maior");
        }else if (p1.height < p2.height){
            System.out.println(p2.name+" é maior");
        }else{
            System.out.println("São Iguais");
        }

        System.out.println("Diferença: "+Math.abs(p1.height - p2.height));


    }
}
