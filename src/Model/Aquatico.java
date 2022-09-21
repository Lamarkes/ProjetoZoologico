package Model;

public class Aquatico {

    int quantidadeDeBarbatanas;
    String nome;
    boolean comeOutrosPeixes;
    String alimentacao;

    public Aquatico(String nome,int quantidadeDeBarbatanas, boolean comeOutrosPeixes, String alimentacao) {
        this.quantidadeDeBarbatanas = quantidadeDeBarbatanas;
        this.comeOutrosPeixes = comeOutrosPeixes;
        this.alimentacao = alimentacao;
        this.nome = nome;
    }

    public int getQuantidadeDeBarbatanas() {
        return quantidadeDeBarbatanas;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }


    public void setQuantidadeDeBarbatanas(int quantidadeDeBarbatanas) {
        this.quantidadeDeBarbatanas = quantidadeDeBarbatanas;
    }

    public boolean isComeOutrosPeixes() {
        return comeOutrosPeixes;
    }

    public void setComeOutrosPeixes(boolean comeOutrosPeixes) {
        this.comeOutrosPeixes = comeOutrosPeixes;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    @Override
    public String toString() {
        return "Aquatico{" +
                "nome="+ nome +
                "quantidadeDeBarbatanas=" + quantidadeDeBarbatanas +
                ", comeOutrosPeixes=" + comeOutrosPeixes +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }

}
