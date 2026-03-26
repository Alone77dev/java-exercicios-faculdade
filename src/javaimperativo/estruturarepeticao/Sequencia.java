package javaimperativo.estruturarepeticao;

/*Mostre a calcule a seqüência
– Para n = 6 (termos)
– h = 2 + 4 + 6 + 16 + 10 + 36 */

class Sequencia {
    public static void main(String[] args) {
        int n = 6;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print((i * 2));
            } else {
                System.out.print((int) Math.pow(i, 2));
            }

            if (i < n) {
                System.out.print(" + ");
            }
        }
    }
}
