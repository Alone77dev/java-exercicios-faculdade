/*Leia o raio (r) de um círculo e mostre o diâmetro, a
circunferência e a área do círculo. Utilize para p o
valor da constante Math.PI (mais precisa que
3,14159).
– Diâmetro = 2r
– Circunferência = 2 pr
– área = p r ²
*/


package entradasaida;

import java.util.Scanner;
import java.lang.Math;

class RaioCirculo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Informe o raio: ");
        double raio = input.nextDouble();
        double diametro = 2 * raio;
        double circun = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.println("Diâmetro: " + diametro);
        System.out.println("Circunferência: " + circun);
        System.out.println("Área: " + area);
    }
}
