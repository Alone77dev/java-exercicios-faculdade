package poo.array;

abstract class Produto {
    private int codigo;
    private String nome;
    private int quantidade;
    private float custo;

    public Produto (int codigo, String nome, int quantidade, float custo){
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorEstoque(){
        return (quantidade * custo);
    }

    public void repor(int quantidade, float custo) {
        this.quantidade += quantidade;
    }

    public boolean validarSaldo(int quantidade){
        return this.quantidade >= quantidade;
    }

    public void baixar(int quantidade){
        if (validarSaldo(quantidade)) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("erro saldo");
        }
    }

    public void mostrarDados() {
        System.out.println("codigo " + codigo + " nome " + nome +
                " quantidade " + quantidade + " custo " + custo +
                " Valor Estoque " + getValorEstoque());
    }

}
