package Model;

import Interface.IComerPeixes;
import Interface.INadar;

public class Orca extends Aquatico implements INadar, IComerPeixes {

    boolean ehAdestrada;

    public Orca(int quantidadeDeBarbatanas,
                String nome,
                boolean comeOutrosPeixes,
                String alimentacao,
                boolean ehAdestrada) {
        super(nome,quantidadeDeBarbatanas, comeOutrosPeixes, alimentacao);
        this.ehAdestrada = ehAdestrada;
    }

    public boolean isEhAdestrada() {
        return ehAdestrada;
    }

    public void setEhAdestrada(boolean ehAdestrada) {
        this.ehAdestrada = ehAdestrada;
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
        return "Orca{" +
                ", ehAdestrada=" + ehAdestrada +
                ", quantidadeDeBarbatanas=" + quantidadeDeBarbatanas +
                ", nome='" + nome + '\'' +
                ", comeOutrosPeixes=" + comeOutrosPeixes +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }

    @Override
    public void ComerPeixes() {
        System.out.println("Comeu outro peixe menor!");
    }

    @Override
    public void Nadar() {
        System.out.println("Nadou muito rapido!");
    }
}
