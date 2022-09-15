package Model;

public class Sardinha extends Animal{

    String cor;
    int quantasBarbatanas;

    public Sardinha(String nomeDoAnimal,
                    int idadeAnimal,
                    String racaAnimal,
                    String reino,
                    double pesoAnimal,
                    boolean castrado,
                    String cor,
                    int quantasBarbatanas,
                    String alimentacao)
    {
        super(nomeDoAnimal,
                idadeAnimal,
                racaAnimal,
                reino,
                pesoAnimal,
                castrado,
                alimentacao);
        this.cor = cor;
        this.quantasBarbatanas = quantasBarbatanas;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String cor(){
        return cor;
    }
    public void setQuantasBarbatanas(int quantasBarbatanas){
        this.quantasBarbatanas = quantasBarbatanas;
    }

    public int getQuantasBarbatanas(){
        return quantasBarbatanas;
    }

    @Override
    public void setNomeDoAnimal(String nomeDoAnimal) {
        super.setNomeDoAnimal(nomeDoAnimal);
    }

    @Override
    public String getNomeDoAnimal() {
        return super.getNomeDoAnimal();
    }

    @Override
    public void setIdadeAnimal(int idadeAnimal) {
        super.setIdadeAnimal(idadeAnimal);
    }
    @Override
    public int getIdadeAnimal() {
        return super.getIdadeAnimal();
    }
    @Override
    public String getRaca(){
        return super.getRaca();
    }
    @Override
    public String getReino(){
        return super.getReino();
    }

    @Override
    public String toString() {
        return "Sardinha{" +
                "cor='" + cor + '\'' +
                ", quantasBarbatanas=" + quantasBarbatanas +
                '}';
    }
}




