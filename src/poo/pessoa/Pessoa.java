package poo.pessoa;

class Pessoa {
    int anoNascimento;
    String name;
    float height;
    int age;

    public String idade(int ano) {
        String resp;

        if (ano < anoNascimento) {
            resp = "Ainda não nascido!!";
        } else {
            resp = "Idade: " + (ano - anoNascimento);
        }
        return resp;
    }

}
