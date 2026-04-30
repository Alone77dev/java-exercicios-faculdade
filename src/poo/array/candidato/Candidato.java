package poo.array.candidato;

class  Candidato{
    int numero;
    String nome;
    int votos;

    public String classificado (int votosMin){
        String resp;
        if (this.votos >= votosMin){
            resp = "Sim, Excedeu "+(this.votos - votosMin)+" voto(s)";
        }else{
            resp = "Não, Faltou "+(votosMin - this.votos)+" votos(s)";
        }
        return resp;
    }

    public String classificado(){
        String resp;
        if (this.votos >= 10){
            resp = "Sim, Excedeu "+(this.votos - 10)+" voto(s)";
        }else{
            resp = "Não, Faltou "+(10 - this.votos)+" votos(s)";
        }
        return resp;
    }

    public void mostrarDados(int i, int minVotos){
        System.out.printf("------%dº Candidato------\n",i+1);
        System.out.println("Número: "+this.numero);
        System.out.println("Nome: "+this.nome);
        System.out.println("Votos: "+this.votos);
        System.out.println(classificado(minVotos));
        //System.out.println(classificado());
    }
}

