package poo.fundamentos.circulopolimofico;

class Cilindro extends CirculoP {
    private float altura;

    public Cilindro() {
        super();
        this.altura = 0;
    }

    public Cilindro(float raio, float altura) {
        super(raio);
        this.altura = altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return this.altura;
    }

    public double areaL() {
        return super.perimetro() * this.altura;
    }

    public double area() {
        return 2 * super.area() + this.areaL();
    }

    public double volume() {
        return super.area() * this.altura;
    }

    public void mostrarDados() {
        System.out.println("Raio: " + super.getRaio());
        System.out.println("Altura: " + this.altura);
        System.out.println("Área da Base: " + super.area());
        System.out.println("Perímetro da Base: " + super.perimetro());
        System.out.println("Diâmetro da Base: " + super.diametro());
        System.out.println("Área Lateral: " + this.areaL());
        System.out.println("Área: " + this.area());
        System.out.println("Volume: " + this.volume());
    }
}
