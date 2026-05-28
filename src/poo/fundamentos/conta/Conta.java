package poo.fundamentos.conta;

abstract class Conta {
    private String numero;
    private String nome;
    private double saldo;

    public Conta(String numero, String nome) {
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(String numero, String nome, double saldo) {
        this(numero, nome);
        this.saldo = saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public double creditar(double valor) {
        return this.saldo += valor;
    }

    public double debitar(double valor) {
        return this.saldo -= valor;
    }

    public void mostrarDados() {
        System.out.println("Número da Conta" + this.numero);
        System.out.println("Nome do Cliente" + this.nome);
        System.out.println("Saldo" + this.saldo);
    }

    public void transferirPara(Conta conta, double valor) {
        this.debitar(valor);
        conta.creditar(valor);
    }
}
