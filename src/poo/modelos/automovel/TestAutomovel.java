package poo.modelos.automovel;

/*Um Automóvel contem chassi, marca, modelo, capacidade tanque, quantidade atual de
litros no tanque, consumo (quantos quilômetros faz com um litro. 10 Km/litro, por
exemplo).
Ao andar o automóvel diminui a quantidade de litros no tanque conforme a quantidade
de quilômetros andado (parâmetro) e de acordo com o seu consumo. Exemplo: Se o
carro tem 50 litros no tanque, percorre uma distância de 20 quilômetros, e tem um
consumo de 10 Km/litro o calculo será: 50 – 20/10 = 48 litros finais.
Depois faremos o método abastecer.
No programa, leia as características do automóvel. Mostre a quantidade inicial de litros
no tanque. Pergunte quantos quilômetros o automóvel percorreu. Mostre novamente a
quantidade de litros no tanque.*/

import java.util.Scanner;

class TestAutomovel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Automovel auto = new Automovel();
        float km;

        System.out.print("Informe o Chassi: ");
        auto.chassi = input.nextLine();

        System.out.print("Informe a Marca: ");
        auto.marca = input.nextLine();

        System.out.print("Informe o Modelo: ");
        auto.modelo = input.nextLine();

        System.out.print("Informe a Capacidade do Tanque: ");
        auto.capaTanque = input.nextFloat();

        System.out.print("Informe a Capacidade Atual no Tanque: ");
        auto.litrosAtual = input.nextFloat();

        System.out.print("Informe o Consumo: ");
        auto.litroKm = input.nextFloat();

        System.out.print("Percorreu quantos KM: ");
        km = input.nextFloat();

        System.out.println("Capacidade Atual no Tanque: " + auto.percorreu(km));


    }
}

