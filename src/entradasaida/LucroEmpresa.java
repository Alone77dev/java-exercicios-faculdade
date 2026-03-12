package entradasaida;

/*Calcule o lucro de um a empresa (receita menos
despesa) e informe o resultado. Obs : Os valores em
Real.*/
import java.util.Scanner;

class  LucroEmpresa
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a Receita da Empresa: ");
        double revenue = input.nextDouble();
        System.out.print("Informe a Despesa: ");
        double expense = input.nextDouble();
        double gain = revenue - expense;
        System.out.println("O lucro foi: " +gain);
    }
}
