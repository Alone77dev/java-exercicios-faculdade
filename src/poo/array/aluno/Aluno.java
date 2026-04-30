package poo.array.aluno;

class Aluno {
    int codigo;
    String nome;
    float nota1;
    float nota2;
    float nota3;

    public float media() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public float media(float peso1, float peso2, float peso3) {
        return ((this.nota1 * peso1 + this.nota2 * peso2 + this.nota3 * peso3) / (peso1 + peso2 + peso3));
    }
}
