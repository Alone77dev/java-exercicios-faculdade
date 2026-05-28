package poo.fundamentos.retangulo;

import java.util.Scanner;

class LerParalelepido {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Paralelepipedo p1 = new Paralelepipedo(2, 4, 6);
        Paralelepipedo p2 = new Paralelepipedo();
        p1.mostrarDados();
        System.out.println("Dados do Paralelepipedo: ");
        System.out.print("Informe a Base: ");
        p2.setLadoa(input.nextFloat());

        while (p2.getLadoa() != 0) {
            System.out.print("Informe a Largura: ");
            p2.setLadob(input.nextFloat());
            System.out.print("Informe a Altura: ");
            p2.setLadoc(input.nextFloat());
            p2.mostrarDados();
            System.out.print("Informe a Base: ");
            p2.setLadoa(input.nextFloat());
        }
    }
}
