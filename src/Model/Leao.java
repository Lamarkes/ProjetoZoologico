package Model;

public class Leao extends Animal{

    public String cor;
    private int quantidadeDePatas;

    public Leao(
                String cor,
                int quantidadeDePatas,
                String nomeDoAnimal,
                int idadeAnimal,
                String racaAnimal,
                String reino,
                String alimentacao,
                double pesoAnimal,
                boolean castrado)
    {
        super(
                nomeDoAnimal,
                idadeAnimal,
                racaAnimal,
                reino,
                pesoAnimal,
                castrado,
                alimentacao);
        this.cor = cor;
        this.quantidadeDePatas = quantidadeDePatas;
    }

    public void setQuantidadeDePatas(int quantidadeDePatas){
        this.quantidadeDePatas = quantidadeDePatas;
    }
    public int getQuantidadeDePatas(){
        return quantidadeDePatas;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
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
    public double getPeso(){
        return super.getPeso();
    }

    @Override
    public String toString() {
        return "Leao{" +
                "cor='" + cor + '\'' +
                ", quantidadeDePatas=" + quantidadeDePatas +
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

