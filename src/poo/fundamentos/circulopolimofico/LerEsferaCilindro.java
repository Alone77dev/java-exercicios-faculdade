package poo.fundamentos.circulopolimofico;

import java.util.Scanner;

class LerEsferaCilindro {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char tipo;

        do {
            tipo = lerTipo();
            if (tipo == 'E') {
                System.out.print("Informe o raio: ");
                Esfera esfera = new Esfera(input.nextFloat());
                esfera.mostrarDados();
            } else if (tipo == 'C') {
                System.out.print("Informe o Raio: ");
                float raio = input.nextFloat();
                System.out.print("Informe a Altura: ");
                float altura = input.nextFloat();
                Cilindro cilindro = new Cilindro(raio, altura);
                cilindro.mostrarDados();
            }

        }
        while (tipo != 'F');
    }

    public static char lerTipo() {
        char tipo;

        do {
            System.out.print("Informe 'E' para Esfera, 'C' para Cilindro ou 'F' para Fim: ");
            tipo = input.next().charAt(0);
        }
        while ((tipo != 'E') && (tipo != 'C') && (tipo != 'F'));
        return tipo;
    }
}

