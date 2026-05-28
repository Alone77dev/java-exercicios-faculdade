package poo.modelos.pessoa;

/*Crie um método na classe pessoa chamado
idade () que recebe um ano e devolve a idade da
pessoa naquele ano. Se necessário informe “Ainda
não era nascido */

class TestPessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.anoNascimento = 2006;
        int ano = 2026;

        System.out.print(pessoa.idade(ano));
    }
}

