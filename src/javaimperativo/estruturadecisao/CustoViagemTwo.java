package javaimperativo.estruturadecisao;

import java.util.Scanner;

class CustoViagemTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Km1: ");
        float km1 = input.nextFloat();
        System.out.print("Informe o Km2: ");
        float km2 = input.nextFloat();
        float kmReal = km2 - km1;
        System.out.print("Informe o km(L) Original: ");
        float kml = input.nextFloat();
        System.out.print("Informe o Consumo(L): ");
        int litros = input.nextInt();
        float consumo = kmReal / litros;
        System.out.print("Informe a Capacidade do Tanque(L): ");
        int capacidade = input.nextInt();
        float autonomia = consumo * capacidade;
        System.out.print("Informe o Preço da Gasosa: ");
        float valorGas = input.nextFloat();
        float custo = litros * valorGas;

        System.out.println("------------------------");
        System.out.println("Quilometragem rodada: " + kmReal);
        System.out.println("Consumo :" + consumo);
        System.out.println("Autonomia do veículo: " + autonomia);
        System.out.println("Custo da viagem: " + custo);
        if (consumo < kml) {
            System.out.println("Revisão");
        }

    }
}

