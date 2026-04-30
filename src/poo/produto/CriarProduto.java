package poo.produto;

/*Sistema de Estoque.
■ Um produto contém código, nome,
quantidade, unidade, valor unitário e valor
total.
■ Um cliente deseja cadastrar
■ seus produtos e mostrar no final :
■ * O produto mais caro
■ * O produto mais barato
■ * O produto que contem mais unidades
■ * O produto que contem menos unidades
■ * O produto mais valioso no estoque
(quantidade * valor unitário)
■ * O produto menos valioso no estoque
(quantidade * valor unitário)
■ * Quanto vale seu estoque (somatório do
valor total de todos os produtos).
*/

public class CriarProduto {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.codigo = 1;
        p1.nome = "Arroz";
        p1.quantidade = 10;
        p1.unidade = "kg";
        p1.valorUnitario = 5.0f;
        p1.calcularValorTotal();

        Produto p2 = new Produto();
        p2.codigo = 2;
        p2.nome = "Feijão";
        p2.quantidade = 5;
        p2.unidade = "kg";
        p2.valorUnitario = 8.0f;
        p2.calcularValorTotal();

        Produto p3 = new Produto();
        p3.codigo = 3;
        p3.nome = "Leite";
        p3.quantidade = 20;
        p3.unidade = "un";
        p3.valorUnitario = 3.0f;
        p3.calcularValorTotal();

        Produto maisCaro = p1;
        Produto maisBarato = p1;
        Produto maisQuantidade = p1;
        Produto menosQuantidade = p1;
        Produto maisValioso = p1;
        Produto menosValioso = p1;

        if (p2.valorUnitario > maisCaro.valorUnitario)
            maisCaro = p2;

        if (p2.valorUnitario < maisBarato.valorUnitario)
            maisBarato = p2;

        if (p2.quantidade > maisQuantidade.quantidade)
            maisQuantidade = p2;

        if (p2.quantidade < menosQuantidade.quantidade)
            menosQuantidade = p2;

        if (p2.valorTotal > maisValioso.valorTotal)
            maisValioso = p2;

        if (p2.valorTotal < menosValioso.valorTotal)
            menosValioso = p2;

        if (p3.valorUnitario > maisCaro.valorUnitario)
            maisCaro = p3;

        if (p3.valorUnitario < maisBarato.valorUnitario)
            maisBarato = p3;

        if (p3.quantidade > maisQuantidade.quantidade)
            maisQuantidade = p3;

        if (p3.quantidade < menosQuantidade.quantidade)
            menosQuantidade = p3;

        if (p3.valorTotal > maisValioso.valorTotal)
            maisValioso = p3;

        if (p3.valorTotal < menosValioso.valorTotal)
            menosValioso = p3;

        double totalEstoque = p1.valorTotal + p2.valorTotal + p3.valorTotal;

        System.out.println("Mais caro: " + maisCaro.nome);
        System.out.println("Mais barato: " + maisBarato.nome);
        System.out.println("Mais quantidade: " + maisQuantidade.nome);
        System.out.println("Menos quantidade: " + menosQuantidade.nome);
        System.out.println("Mais valioso: " + maisValioso.nome);
        System.out.println("Menos valioso: " + menosValioso.nome);
        System.out.println("Total do estoque: " + totalEstoque);
    }
}

