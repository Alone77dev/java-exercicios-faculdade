package javaimperativo.metodosestaticos;

import java.util.Scanner;

public class DecomporNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Informe um número (0 para sair): ");
            numero = sc.nextInt();

            if (numero != 0) {
                String resultado = decompor(numero);
                System.out.println(resultado);
            }

        } while (numero != 0);

        System.out.println("Programa encerrado!");
        sc.close();
    }

    public static String decompor(int n) {
        int unidade = n % 10;
        int dezena = (n / 10) % 10;
        int centena = (n / 100) % 10;
        int milhar = (n / 1000) % 10;

        String resposta = "";

        if (unidade > 0 || n < 10) resposta += unidade + " unidade(s)";

        if (dezena > 0) resposta += ", " + dezena + " dezena(s)";

        if (centena > 0) resposta += ", " + centena + " centena(s)";

        if (milhar > 0) resposta += ", " + milhar + " milhar(es)";

        return resposta;
    }
}
