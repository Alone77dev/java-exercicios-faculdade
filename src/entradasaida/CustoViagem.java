package entradasaida;

/*Um motorista anota a marcação do odômetro do seu
veículo antes (Km1) e após uma viagem (Km2), bem
como o número de litros (litros) de combustível gastos.
Faça um programa em Java que leia os 3 dados acima, o
preço do litro de combustível (preco), a capacidade do
tanque (capacidade) e mostre:
– a) Quilometragem rodada (Km2- Km1).
– b) Consumo : quantos quilômetros por litro faz o
veículo (Quilometragem/litros).
– c) Autonomia do veículo (Consumo * capacidade).
– d) Custo da viagem (litros * preco).*/

import java.util.Scanner;

class  CustoViagem
{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o Km1: ");
        float km1 = input.nextFloat();
        System.out.print("Informe o Km2: ");
        float km2 = input.nextFloat();
        float kmReal = km2 - km1;
        System.out.print("Informe o Consumo(L): ");
        int litros = input.nextInt();
        float consumo = kmReal/litros;
        System.out.print("Informe a Capacidade do Tanque(L): ");
        int capacidade = input.nextInt();
        float autonomia = consumo * capacidade;
        System.out.print("Informe o Preço da Gasosa: ");
        float valorGas = input.nextFloat();
        float custo = litros * valorGas;

        System.out.println("------------------------");
        System.out.println("Quilometragem rodada: "+kmReal);
        System.out.println("Consumo :"+consumo);
        System.out.println("Autonomia do veículo: "+autonomia);
        System.out.println("Custo da viagem: "+custo);

    }
}
