package poo.fundamentos.produto;

public class ProdutoCustoMedio extends Produto {

    public ProdutoCustoMedio(int codigo, String nome, int quantidade, float custo) {
        super(codigo, nome, quantidade, custo);
    }

    public void repor(int quantidade, float custo) {
        float novoCusto = ((getQuantidade() * getCusto()) + (quantidade * custo)) / (getQuantidade() + quantidade);
        setCusto(novoCusto);
        super.repor(quantidade, custo);

    }
}
