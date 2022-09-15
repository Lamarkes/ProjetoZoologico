package Model;

public class Orca extends Animal{

    int quantasBarbatanas;
    boolean ehAdestrada;

    public Orca(String nomeDoAnimal,
                int idadeAnimal,
                String racaAnimal,
                String reino,
                double pesoAnimal,
                boolean castrado,
                String alimentacao,
                int quantasBarbatanas,
                boolean ehAdestrada) {
        super(nomeDoAnimal, idadeAnimal, racaAnimal, reino, pesoAnimal, castrado, alimentacao);
        this.ehAdestrada = ehAdestrada;
        this.quantasBarbatanas = quantasBarbatanas;
    }

    public int getQuantasBarbatanas() {
        return quantasBarbatanas;
    }

    public void setQuantasBarbatanas(int quantasBarbatanas) {
        this.quantasBarbatanas = quantasBarbatanas;
    }

    public boolean isEhAdestrada() {
        return ehAdestrada;
    }

    public void setEhAdestrada(boolean ehAdestrada) {
        this.ehAdestrada = ehAdestrada;
    }

    @Override
    public String getNomeDoAnimal() {
        return super.getNomeDoAnimal();
    }

    @Override
    public int getIdadeAnimal() {
        return super.getIdadeAnimal();
    }

    @Override
    public String getRaca() {
        return super.getRaca();
    }

    @Override
    public String getReino() {
        return super.getReino();
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public String toString() {
        return "Orca{" +
                "quantasBarbatanas=" + quantasBarbatanas +
                ", ehAdestrada=" + ehAdestrada +
                '}';
    }
}
