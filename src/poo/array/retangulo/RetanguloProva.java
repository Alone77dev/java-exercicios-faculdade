package poo.array.retangulo;

import java.util.Scanner;

class RetanguloProva {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a Quantidade de Retangulos: ");
        Retangulo r[] = new Retangulo[input.nextInt()];
        float somaArea = 0;
        float somaPerimetro = 0;
        int indiceMaior = 0;

        for (int i = 0;i<r.length;i++){
            r[i] = new Retangulo();

            System.out.printf("----Cadastro %d Retângulo----\n", i+1);
            System.out.print("Informe a Base: ");
            r[i].base = input.nextFloat();

            System.out.print("Informe a Altura: ");
            r[i].altura = input.nextFloat();

        }

        for (int i = 0;i<r.length;i++){
            System.out.printf("\n----%d Item----\n",i+1);
            System.out.println("Base: "+r[i].base);
            System.out.println("Altura: "+r[i].altura);
            System.out.println("Área: "+r[i].area());
            System.out.println("Perímetro: "+r[i].perimetro());

            if (r[i].area() > r[indiceMaior].area()){
                indiceMaior = i;
            }

            somaArea += r[i].area();
            somaPerimetro += r[i].perimetro();
        }
        System.out.println("\nSoma das Áreas: "+somaArea);
        System.out.println("Soma dos Perímetros: "+somaPerimetro);
        System.out.printf("O maior Retângulo %d é com %.2f de Área", indiceMaior+1, r[indiceMaior].area());
    }
}
