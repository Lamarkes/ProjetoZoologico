package Model;

import Interface.INadar;

public class PeixePalhaco extends Aquatico implements INadar {


    String cor;

    public PeixePalhaco(String nome,
                        int quantidadeDeBarbatanas,
                        String cor,
                        boolean comeOutrosPeixes,
                        String alimentacao) {
        super(nome, quantidadeDeBarbatanas, comeOutrosPeixes, alimentacao);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
        return "PeixePalhaco{" +
                "cor='" + cor + '\'' +
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
