package Model;

public class Papagaio extends Animal{

    protected boolean temAsas = true;
    protected boolean falaMuito = true;


    public Papagaio(String nomeDoAnimal,
                    int idadeAnimal,
                    String racaAnimal,
                    String reino,
                    double pesoAnimal,
                    boolean castrado,
                    boolean temAsas,
                    boolean falaMuito,
                    String alimentacao)
    {
        super(  nomeDoAnimal,
                idadeAnimal,
                racaAnimal,
                reino,
                pesoAnimal,
                castrado,
                alimentacao);
        this.temAsas = temAsas;
        this.falaMuito = falaMuito;
    }

    public void setTemAsas(boolean temAsas){
        this.temAsas = temAsas;
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
}
