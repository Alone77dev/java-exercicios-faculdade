package poo.fundamentos.conta;

class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, String nome) {
        super(numero, nome);
    }

    public ContaPoupanca(String numero, String nome, double saldo) {
        super(numero, nome, saldo);
    }

    public void renderJuros(float taxa) {
        super.creditar(super.getSaldo() * (taxa / 100));
    }

    public void mostrarDados() {
        System.out.println("Conta Poupança");
        System.out.println("Número da Conta: " + super.getNumero());
        System.out.println("Nome do Cliente: " + super.getNome());
        System.out.println("Saldo: " + super.getSaldo());
        System.out.println("-------------------------------------------");
    }
}
