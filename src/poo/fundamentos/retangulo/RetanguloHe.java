package poo.fundamentos.retangulo;

class RetanguloHe {
    protected float ladoa;
    private float ladob;

    public RetanguloHe(float ladoa, float ladob) {
        this.ladoa = ladoa;
        this.ladob = ladob;
    }

    public void setLadoa(float ladoa) {
        this.ladoa = ladoa;
    }

    public float getLadoa() {
        return this.ladoa;
    }

    public void setLadob(float ladob) {
        this.ladob = ladob;
    }

    public float getLadob() {
        return this.ladob;
    }

    public double area() {
        return this.ladoa * this.ladob;
    }

    public double perimetro() {
        return 2 * (this.ladoa + this.ladob);
    }

    public void mostrarDados() {
        System.out.println("Retangulo com Lados " + this.ladoa + " e " + this.ladob);
        System.out.print("Área: " + this.area());
        System.out.print("Perimetro: " + this.perimetro());
    }
}
