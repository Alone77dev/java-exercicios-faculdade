package poo.fundamentos.retangulo;

class Paralelepipedo extends RetanguloHe {
    private float ladoc;

    public Paralelepipedo() {
        super(0, 0);
        this.ladoc = 0;
    }

    public Paralelepipedo(float ladoa, float ladob, float ladoc) {
        super(ladoa, ladob);
        this.ladoc = ladoc;
    }

    public void setLadoc(float ladoc) {
        this.ladoc = ladoc;
    }

    public float getLadoc() {
        return this.ladoc;
    }

    public double area() {
        return 2 * (this.ladoa * super.getLadob() + this.ladoa * this.ladoc + super.getLadob() * this.ladoc);
    }

    public double perimetro() {
        return 0;
    }

    public double volume() {
        return super.area() * this.ladoc;
    }

    public void mostrarDados() {
        System.out.println("Paralelepipedo com base " + super.ladoa + ", largura " + super.getLadob()
                + " e altura " + this.ladoc
                + "\nArea = " + this.area() +
                "\nVolume = " + this.volume());
    }
}
