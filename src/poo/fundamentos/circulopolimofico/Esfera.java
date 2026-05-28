package poo.fundamentos.circulopolimofico;

class Esfera extends CirculoP {

    public Esfera() {
        super();
    }

    public Esfera(float raio) {
        super(raio);
    }

    public double area() {
        return 4 * super.area();
    }

    public double volume() {
        return (float) 4 / 3 * Math.PI * Math.pow(super.getRaio(), 3);
    }

    public void mostrarDados() {
        System.out.println("Raio: " + super.getRaio());
        System.out.println("Área: " + this.area());
        System.out.println("Volume: " + this.volume());
    }
}
