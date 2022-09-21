package Model;

import Interface.IBicar;
import Interface.IBotarOvos;

public class Flamingo extends Ave implements IBotarOvos, IBicar {
    boolean temBico;
    String cor;


    public Flamingo(boolean temBico,
                    String nome,
                    String cor,
                    int quantidadeDeAsas,
                    boolean podeVoar,
                    boolean temPenas) {
        super(nome, quantidadeDeAsas, podeVoar, temPenas);
        this.temBico = temBico;
        this.cor = cor;
    }

    public boolean isTemBico() {
        return temBico;
    }

    public void setTemBico(boolean temBico) {
        this.temBico = temBico;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
        return "Flamingo{" +
                "temBico=" + temBico +
                ", cor='" + cor + '\'' +
                ", nome='" + nome + '\'' +
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
        System.out.println("A ave colocou ovos!");
    }
}
