package poo.modelos.retangulo;

class Retangulo {
    float base;
    float altura;

    public float area() {
        return base * altura;
    }

    public float perimetro() {
        return (2 * (base + altura));
    }

    public void mostrarDados() {
        System.out.println("Área: " + this.area());
        System.out.println("Perímetro : " + this.perimetro());
        if (this.base == altura) {
            System.out.println("É um Quadrado!!!");
        }
        System.out.println("-----------------------------------");
    }
}
