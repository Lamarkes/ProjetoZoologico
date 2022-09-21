package Model;

import Interface.IBicar;
import Interface.IBotarOvos;

public class Papagaio extends Ave implements IBotarOvos, IBicar {

    protected boolean temAsas = true;
    protected boolean falaMuito = true;

    String alimentacao;

    public Papagaio(String nome,
                    int quantidadeDeAsas,
                    boolean podeVoar,
                    boolean temPenas,
                    boolean temAsas,
                    boolean falaMuito,
                    String alimentacao) {
        super(nome, quantidadeDeAsas, podeVoar, temPenas);
        this.temAsas = temAsas;
        this.falaMuito = falaMuito;
        this.alimentacao = alimentacao;
    }

    public boolean isTemAsas() {
        return temAsas;
    }

    public void setTemAsas(boolean temAsas) {
        this.temAsas = temAsas;
    }

    public boolean isFalaMuito() {
        return falaMuito;
    }

    public void setFalaMuito(boolean falaMuito) {
        this.falaMuito = falaMuito;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    @Override
    public int getQuantidadeDeAsas() {
        return super.getQuantidadeDeAsas();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }


    @Override
    public String toString() {
        return "Papagaio{" +
                "temAsas=" + temAsas +
                ", falaMuito=" + falaMuito +
                ", alimentacao='" + alimentacao + '\'' +
                ", nome='" + nome + '\'' +
                ", quantidadeDeAsas=" + quantidadeDeAsas +
                ", podeVoar=" + podeVoar +
                ", temPenas=" + temPenas +
                '}';
    }


    @Override
    public void BotarOvos() {
        System.out.println("A ave botou Ovos!");
    }

    @Override
    public void Bicar() {
        System.out.println("A ave Bicou!");
    }
}
