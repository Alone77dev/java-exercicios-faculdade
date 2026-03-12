package estruturasdecisao;

/*Determine se um cliente de uma loja excedeu o limite
de crédito. Leia :
– Número da conta
– O Nome do Cliente
– Saldo do início do mês
– Total de todos os itens cobrados no mês
– Total de pagamentos efetuados pelo cliente no mês
– Limite autorizado de crédito
– Mostrar o Novo Saldo. Cálculo :
– Saldo Inicial + cobranças - pagamentos
– Caso este saldo exceda o limite de crédito informe :
– “Limite de crédito excedido em R$ X reais”
– Senão informe: “Ainda pode comprar R$ X reais!"*/

import java.util.Scanner;

class LimiteCreditoClienteLoja {
    public static void main(String[] args) {

        double saldoInicial, itensTotal, valorPagoMes, limiteCredito, saldo, novoSaldo;
        String nomeCliente, numConta;

        Scanner input = new Scanner(System.in);
        System.out.print("Nome do Cliente: ");
        nomeCliente = input.nextLine();
        System.out.print("Número da Conta: ");
        numConta = input.nextLine();
        System.out.print("Saldo Inicial: ");
        saldoInicial = input.nextDouble();
        System.out.print("Total Itens: ");
        itensTotal = input.nextDouble();
        System.out.print("Pagamento Total do Mês: ");
        valorPagoMes = input.nextDouble();
        System.out.print("Limite Total do Crédito: ");
        limiteCredito = input.nextDouble();

        novoSaldo = saldoInicial + itensTotal - valorPagoMes;
        System.out.println("Saldo Novo: " + novoSaldo);


        if (novoSaldo > limiteCredito) {
            saldo = novoSaldo - limiteCredito;
            System.out.println("Limite de crédito excedido em R$" + saldo + " reais");
        } else {
            saldo = limiteCredito - novoSaldo;
            System.out.println("Ainda pode comprar R$" + saldo + " reais");
        }


    }
}
