package poo.fundamentos.conta;

class ContaCorrente extends Conta {

    public ContaCorrente(String numero, String nome) {
        super(numero, nome);
    }

    public ContaCorrente(String numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    public double debitar(double valor) {
        return super.debitar(valor * (1 + 0.0038));
    }

    public void mostrarDados() {
        System.out.println("Conta Corrente");
        System.out.println("Número da Conta: " + super.getNumero());
        System.out.println("Nome do Cliente: " + super.getNome());
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("-------------------------------------------");
    }
}
