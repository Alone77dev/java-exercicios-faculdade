package poo.array.produto;

import java.util.Scanner;

class Mercado {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a Quantidade Produtos: ");
        Produto p[] = new Produto[input.nextInt()];
        double totalEstoque = 0;

        Produto maisValioso = null;
        System.out.println("---------------------------------");

        for (int i = 0; i < p.length; i++) {
            p[i] = new Produto();

            System.out.printf("Informe o Código do %dº Produto: ", i + 1);
            p[i].codigo = input.nextInt();
            input.nextLine();

            System.out.printf("Informe o nome do %dº Produto: ", i + 1);
            p[i].nome = input.nextLine();

            System.out.printf("Informe a Quantidade do %dº Produto: ", i + 1);
            p[i].quantidade = input.nextInt();
            input.nextLine();

            System.out.printf("Informe a Unidade do %dº Produto: ", i + 1);
            p[i].unidade = input.nextLine();

            System.out.printf("Informe o Valor(uni) do %dº Produto: ", i + 1);
            p[i].valorUnitario = input.nextFloat();
            input.nextLine();

            System.out.println("----------------------------------------");
        }

        for (int i = 0; i < p.length; i++) {

            System.out.printf("%dº Produto: \n", i + 1);
            System.out.println("Código: " + p[i].codigo);
            System.out.println("Nome: " + p[i].nome);
            System.out.println("Quantidade: " + p[i].quantidade);
            System.out.println("Unidade: " + p[i].unidade);
            System.out.println("Valor Unitário: " + p[i].valorUnitario);
            System.out.println("Valor Total: " + p[i].calcularValorTotal());
            System.out.println("---------------------------------------------");

            if (maisValioso == null || p[i].calcularValorTotal() > maisValioso.calcularValorTotal()) {
                maisValioso = p[i];
            }
            totalEstoque += p[i].calcularValorTotal();
        }

        System.out.println("Produto mais valioso: " + maisValioso.nome);

        System.out.println("Valor do produto mais valioso: " + maisValioso.calcularValorTotal());
        System.out.println("Total do estoque: " + totalEstoque);

    }
}