package Model;

public class PeixePalhaco extends Animal {


    String cor;

    public PeixePalhaco(String nomeDoAnimal,
                        int idadeAnimal,
                        String racaAnimal,
                        String reino,
                        double pesoAnimal,
                        boolean castrado,
                        String alimentacao,
                        String cor) {
        super(nomeDoAnimal, idadeAnimal, racaAnimal, reino, pesoAnimal, castrado, alimentacao);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
    public String getRaca(){
        return super.getRaca();
    }
    @Override
    public String getReino(){
        return super.getReino();
    }

    @Override
    public double getPeso() {
        return super.getPeso();
    }

    @Override
    public String toString() {
        return "PeixePalhaco{" +
                "cor='" + cor + '\'' +
                '}';
    }
}
