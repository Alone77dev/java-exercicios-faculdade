package poo.modelos.circulo;

/* Criar um programa que leia um raio e mostre o
diâmetro, a área e o comprimento de um círculo.
Sair com zero. porém a classe
Circulo conterá um método mostrarDados () que
mostra o diâmetro, área e comprimento.*/


import java.util.Scanner;

class CriarCirculo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circulo circulo = new Circulo();

        do {
            System.out.print("Informe o valor do raio: ");
            circulo.raio = input.nextFloat();

            if (circulo.raio != 0) {
                circulo.mostrarDados();
            }
        }
        while (circulo.raio != 0);

        System.out.print("Programa Finalizado!!");
    }
}
