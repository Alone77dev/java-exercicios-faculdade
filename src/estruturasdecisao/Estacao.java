package estruturasdecisao;

/*Determinar em que estação do ano um dado mês
ocorre.
– 1 e 2 (Verão)
– 3, 4 e 5 (Outono)
– 6, 7 e 8 (Inverno)
– 9, 10 e 11 (Primavera)
– 12 (Verão).
– Obs :
• Mês deve ser do tipo short
• Dê a resposta após o switch
• Use apenas 4 break’ s.*/

import java.util.Scanner;

class Estacao {

    public static void main(String[] args) {

        String estacao;
        short mes;

        Scanner input = new Scanner(System.in);
        System.out.print("Informe o mes: ");
        mes = input.nextShort();

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacao = "Verão";
                break;
            case 3:
            case 4:
            case 5:
                estacao = "Outono";
                break;
            case 6:
            case 7:
            case 8:
                estacao = "Inverno";
                break;
            case 9:
            case 10:
            case 11:
                estacao = "Primavera";
                break;
            default:
                estacao = "Invalido";
        }
        System.out.println("\n Mes " + mes + " :" + estacao);
    }
}
