package poo.modelos.automovel;

class Automovel {
    String chassi;
    String marca;
    String modelo;
    float capaTanque;
    float litrosAtual;
    float litroKm;

    public float percorreu(float km) {
        return this.litrosAtual - (km / this.litroKm);
    }
}
