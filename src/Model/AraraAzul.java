package Model;

import Interface.IBicar;
import Interface.IBotarOvos;

public class AraraAzul extends Ave implements IBicar, IBotarOvos {
    String cor;
    boolean ehFilhote;

    public AraraAzul(String nome,int quantidadeDeAsas, boolean podeVoar, boolean temPenas, String cor, boolean ehFilhote) {
        super(nome,quantidadeDeAsas, podeVoar, temPenas);
        this.cor = cor;
        this.ehFilhote = ehFilhote;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEhFilhote() {
        return ehFilhote;
    }

    public void setEhFilhote(boolean ehFilhote) {
        this.ehFilhote = ehFilhote;
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
        return "AraraAzul{" +
                "cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
                ", ehFilhote=" + ehFilhote +
                ", quantidadeDeAsas=" + quantidadeDeAsas +
                ", podeVoar=" + podeVoar +
                ", temPenas=" + temPenas +
                '}';
    }

    @Override
    public void Bicar() {
        System.out.println("A ave bicou!");
    }

    @Override
    public void BotarOvos() {
        System.out.println("A ave botou ovos!!");
    }
}

