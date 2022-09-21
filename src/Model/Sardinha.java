package Model;

import Interface.INadar;

public class Sardinha extends Aquatico implements INadar {

    String cor;
    int quantidadeDeBranquias;

    public Sardinha(String nome,
                    int quantidadeDeBarbatanas,
                    boolean comeOutrosPeixes,
                    String alimentacao,
                    String cor,
                    int quantidadeDeBranquias) {
        super(nome, quantidadeDeBarbatanas, comeOutrosPeixes, alimentacao);
        this.cor = cor;
        this.quantidadeDeBranquias = quantidadeDeBranquias;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantidadeDeBranquias() {
        return quantidadeDeBranquias;
    }

    public void setQuantidadeDeBranquias(int quantidadeDeBranquias) {
        this.quantidadeDeBranquias = quantidadeDeBranquias;
    }

    @Override
    public int getQuantidadeDeBarbatanas() {
        return super.getQuantidadeDeBarbatanas();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public boolean isComeOutrosPeixes() {
        return super.isComeOutrosPeixes();
    }

    @Override
    public String getAlimentacao() {
        return super.getAlimentacao();
    }

    @Override
    public String toString() {
        return "Sardinha{" +
                "cor='" + cor + '\'' +
                ", quantidadeDeBranquias=" + quantidadeDeBranquias +
                ", quantidadeDeBarbatanas=" + quantidadeDeBarbatanas +
                ", nome='" + nome + '\'' +
                ", comeOutrosPeixes=" + comeOutrosPeixes +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }

    @Override
    public void Nadar() {
        System.out.println("O peixe nadou bem rapido!");
    }
}




