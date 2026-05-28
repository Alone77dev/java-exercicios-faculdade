package poo.modelos.circulo;

class Circulo {
    float raio = 0;

    public float diametro() {
        return this.raio * 2f;
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double comprimento() {
        return 2 * Math.PI * this.raio;
    }

    public double area(float comprimento) {
        float raio;
        raio = comprimento / 2;
        return (Math.pow(raio, 2));
    }

    public void mostrarDados() {
        System.out.println("Informações do Circulo: ");
        System.out.println("Diâmetro: " + this.diametro());
        System.out.println("Área: " + this.area());
        System.out.println("Comprimento: " + this.comprimento());
        System.out.println("-------------------------------");
    }
}

