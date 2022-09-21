package Model;

public class Animal {

    // caracteristicas dos Animais;
    public String nomeDoAnimal;
    public int idadeAnimal;
    public String raca;
    public String reino;
    public double peso;
    public boolean castrado;

    public String alimentacao;

    // construtor Animal
    public Animal(
            String nomeDoAnimal,
            int idadeAnimal,
            String racaAnimal,
            String reino,
            double pesoAnimal,
            boolean castrado,
            String alimentacao){
        this.nomeDoAnimal = nomeDoAnimal;
        this.idadeAnimal = idadeAnimal;
        this.raca = racaAnimal;
        this.reino = reino;
        this.peso = pesoAnimal;
        this.castrado = castrado;
        this.alimentacao = alimentacao;

    }
    // set -> nome do Animal
    public void setNomeDoAnimal(String nomeDoAnimal){
        this.nomeDoAnimal = nomeDoAnimal;
    }
    // get -> do nome que foi "setado"
    public String getNomeDoAnimal(){
        return nomeDoAnimal;
    }
    public void setIdadeAnimal(int idadeAnimal){
        this.idadeAnimal = idadeAnimal;
    }
    public int getIdadeAnimal(){
        return idadeAnimal;
    }
    public void setRaca(String raca){
        this.raca = raca;
    }
    public String getRaca(){
        return raca;
    }
    public String getReino(){
        return reino;
    }
    public void setReino(String reino){
        this.reino = reino;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "\nAnimal{" +
                "nomeDoAnimal='" + nomeDoAnimal + '\'' +
                ", idadeAnimal=" + idadeAnimal +
                ", raca='" + raca + '\'' +
                ", reino='" + reino + '\'' +
                ", peso=" + peso +
                ", castrado=" + castrado +
                ", alimentacao='" + alimentacao + '\'' +
                '}';
    }
}
