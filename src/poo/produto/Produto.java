package poo.produto;

class Produto {
    int codigo;
    String nome;
    int quantidade;
    String unidade;
    float valorUnitario;
    float valorTotal;

    public double calcularValorTotal() {
        return this.quantidade * this.valorUnitario;
    }

    public void mostrarDados(){
        System.out.println("Código: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Quantidade: "+this.quantidade);
        System.out.println("Unidade: "+this.unidade);
        System.out.println("Valor Unitário: "+this.valorUnitario);
        System.out.println("Valor Total: "+this.calcularValorTotal());
    }
}
