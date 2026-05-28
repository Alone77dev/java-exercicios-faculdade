package poo.fundamentos.produto;


public class MovimentoEstoque {
    public static void main(String[] args) {

        ProdutoCustoAtual feijao = new ProdutoCustoAtual(1, "feijao", 60, 1.50f);
        ProdutoCustoMedio tomate = new ProdutoCustoMedio(2, "tomate", 120, 2.50f);

        System.out.println("Valores iniciais");
        feijao.mostrarDados();
        tomate.mostrarDados();

        System.out.println("\nRepor (100,1.60) e (100,2.60)");
        feijao.repor(100, 1.60f);
        tomate.repor(100, 2.60f);
        feijao.mostrarDados();
        tomate.mostrarDados();

        System.out.println("\nBaixar 30 e 50");
        feijao.baixar(30);
        tomate.baixar(50);
        feijao.mostrarDados();
        tomate.mostrarDados();

        System.out.println("\nBaixar 300");
        tomate.baixar(300);
    }
}

