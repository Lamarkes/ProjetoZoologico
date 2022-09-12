package Model;

public class Zoologico {


    String nome;
    Ambiente ambiente;

    public Zoologico(String nome, Ambiente ambiente){
        this.ambiente = ambiente;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public Ambiente getAmbiente(){
        return ambiente;
    }

    @Override
    public String toString() {
        return "Zoologico{" +
                "nome='" + nome + '\'' +
                ", ambiente=" + ambiente +
                '}';
    }
}
