package poo.modelos.cubo;

class Cubo {
    float aresta;

    public double area() {
        return 6 * (Math.pow(aresta, 2));
    }

    public double volume() {
        return Math.pow(aresta, 3);
    }

    public void mostrarDados() {
        System.out.println("Área: " + this.area());
        System.out.println("Volume: " + this.volume());
    }
}
