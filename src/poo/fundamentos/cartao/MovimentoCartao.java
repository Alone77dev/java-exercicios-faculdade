package poo.fundamentos.cartao;

class MovimentoCartao {
    public static void main(String[] args) {
        CartaoEspecial c = new CartaoEspecial("1", "João", 500, 50);

        c.comprar(50);

        c.mostrarDados();

        c.comprar(49);

        c.mostrarDados();

        c.comprar(450);

        c.mostrarDados();

        c.comprar(50);

        c.mostrarDados();

        c.pagar(50);

        c.mostrarDados();

        c.comprar(50);

        c.mostrarDados();

        c.pagarTudo();

        c.mostrarDados();

    }
}
