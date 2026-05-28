package poo.fundamentos.circulopolimofico;

abstract class CirculoP {
    private float raio;

    public CirculoP() {
        this.raio = 0;
    }

    public CirculoP(float raio) {
        this.raio = raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getRaio() {
        return this.raio;
    }

    public double diametro() {
        return 2 * this.raio;
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * this.raio;
    }

    public void mostrarDados() {
        System.out.println("Raio: " + this.raio);
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro: " + this.perimetro());
        System.out.println("Diâmetro: " + this.diametro());
    }
}
