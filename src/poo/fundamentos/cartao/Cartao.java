package poo.fundamentos.cartao;

abstract class Cartao {
    private String numero;
    private String nome;
    private double limite;
    private double saldoD;

    public Cartao(String numero, String nome, double limite) {
        this.numero = numero;
        this.nome = nome;
        this.limite = limite;
        this.saldoD = 0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return this.limite;
    }

    public double getSaldoD() {
        return this.saldoD;
    }

    public boolean autorizar(double valor) {
        return (valor + this.saldoD <= limite);
    }

    public void comprar(double valor) {
        if (this.autorizar(valor)) {
            this.saldoD += valor;
        } else {
            System.out.println("Não autorizada!!");
        }
    }

    public void pagar(double valor) {
        this.saldoD -= valor;
    }

    public void mostrarDados() {
        System.out.println("Número da Conta: " + this.numero);
        System.out.println("Nome do titular: " + this.nome);
        System.out.println("Limite: " + this.limite);
        System.out.println("Saldo Devedor: " + this.saldoD);

    }
}