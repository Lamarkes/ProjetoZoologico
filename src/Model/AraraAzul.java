package Model;

public class AraraAzul extends Animal{
    String cor;
    boolean ehFilhote;

    public AraraAzul(String nomeDoAnimal,
                     int idadeAnimal,
                     String racaAnimal,
                     String reino,
                     double pesoAnimal,
                     boolean castrado,
                     String alimentacao,
                     String cor,
                     boolean ehFilhote) {
        super(nomeDoAnimal, idadeAnimal, racaAnimal, reino, pesoAnimal, castrado, alimentacao);
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
        return "AraraAzul{" +
                "cor='" + cor + '\'' +
                ", ehFilhote=" + ehFilhote +
                ", nomeDoAnimal='" + nomeDoAnimal + '\'' +
                ", idadeAnimal=" + idadeAnimal +
                ", raca='" + raca + '\'' +
                ", reino='" + reino + '\'' +
                ", peso=" + peso +
                ", castrado=" + castrado +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }
}
