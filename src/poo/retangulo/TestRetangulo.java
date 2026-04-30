package poo.retangulo;

/* Crie uma classe Retângulo contendo os
atributos base e altura e os métodos área (base *
altura) e perímetro (2 * (base + altura)). Depois
crie um programa para ler a base e a altura e
mostrar os dados do retângulo. Sair quando a
base do for zero.Construa um
método que retorna se é ou não um
quadrado. O mostrarDados deve incluir
esta informação.*/

import java.util.Scanner;

class TestRetangulo {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Informe a base: ");
            retangulo.base = input.nextFloat();

            if (retangulo.base != 0){
                System.out.print("Informe a altura: ");
                retangulo.altura = input.nextFloat();
                retangulo.mostrarDados();
            }

        }while (retangulo.base != 0);
        System.out.print("Programa Finalizado!!");
    }
}
