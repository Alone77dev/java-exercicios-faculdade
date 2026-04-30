package poo.cubo;

/*Crie uma Classe Cubo contendo o atributo
aresta (a) e os métodos area (6 * a2
) e volume(a3). Depois crie um programa para ler a aresta e
mostrar os dados do cubo.
*/

import java.util.Scanner;

class TestCubo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Cubo cubo = new Cubo();

        System.out.print("Informe a Aresta: ");
        cubo.aresta = input.nextFloat();

        while (cubo.aresta != 0) {
            cubo.mostrarDados();
            System.out.print("Informe a Aresta: ");
            cubo.aresta = input.nextFloat();
        }

    }
}
