package estruturasdecisao;

/*Um número será digitado. Você deverá
informar se ele é : Positivo, Negativo ou Nulo.
*/

import java.util.Scanner;

class Numero {
    public static void main(String[] args) {
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um Número: ");
        numero = input.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } else if (numero < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Nulo");
        }


    }
}
