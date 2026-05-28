package poo.fundamentos.conta;

class Movimento {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("1", "Maria");
        ContaPoupanca cp = new ContaPoupanca("2", "Bruno");

        System.out.println("Movimento Bancario");
        System.out.println("Creditos Iniciais 1000 e 600");

        cc.creditar(1000);
        cp.creditar(600);

        cc.mostrarDados();
        cp.mostrarDados();

        System.out.println("Debitando 100 e 50");
        cc.debitar(100);
        cc.debitar(100);

        cc.mostrarDados();
        cp.mostrarDados();

        System.out.println("Transferindo 100 da Conta Corrente para Conta Poupança");
        cc.transferirPara(cp, 100);
        cc.mostrarDados();
        cp.mostrarDados();
        System.out.println("Rendendo juros da Poupança");
        cp.renderJuros(10);
        cp.mostrarDados();
    }
}
