package poo.fundamentos.cartao;

class CartaoEspecial extends Cartao {
    private double valorMin;

    public CartaoEspecial(String numero, String nome, double limite, double valorMin) {
        super(numero, nome, limite);
        this.valorMin = valorMin;
    }

    public void setValorMin(double valorMin) {
        this.valorMin = valorMin;
    }

    public double getValorMin() {
        return this.valorMin;
    }

    public void comprar(double valor) {
        if (valor >= this.valorMin) {
            super.comprar(valor);
        } else {
            System.out.println("Não autorizada!! Valor Minimo: " + valorMin);
        }
    }

    public void pagarTudo() {
        super.pagar(this.getSaldoD());
    }

    public void mostrarDados() {
        System.out.println("Número da Conta: " + super.getNumero());
        System.out.println("Nome do titular: " + super.getNome());
        System.out.println("Limite: " + super.getLimite());
        System.out.println("Saldo Devedor: " + super.getSaldoD());
        System.out.println("Saldo Devedor: " + this.valorMin);
    }
}
