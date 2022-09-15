package Model;



public class Ambiente {
    Animal[] ambienteTerrestre;
    Animal[] ambienteAereo;
    Animal[] ambienteAquatico;

    public Ambiente(int capacidadeDoAmbiente){
        ambienteTerrestre = new Animal[capacidadeDoAmbiente];
        ambienteAereo = new Animal[capacidadeDoAmbiente];
        ambienteAquatico = new Animal[capacidadeDoAmbiente];
    }

        public void getAmbienteTerrestre() {
        for (int i = 0; i < this.ambienteTerrestre.length; i++) {
            System.out.println(ambienteTerrestre[i]);
        }
    }

    public void setAmbienteTerrestre(int posicao, Animal animal) {
        this.ambienteTerrestre[posicao] = animal;
    }

    public void getAmbienteAereo() {
        for (int i = 0; i < this.ambienteAereo.length; i++) {
            System.out.println(ambienteAereo[i]);
        }
    }

    public void setAmbienteAereo(int posicao, Animal animal) {
        this.ambienteAereo[posicao] = animal;
    }

    public void getAmbienteAquatico() {
        for (int i =0; i< this.ambienteAquatico.length; i++){
            System.out.println(ambienteAquatico[i]);
        }
    }

    public void setAmbienteAquatico(int posicao, Animal animal) {
        this.ambienteAquatico[posicao] = animal;
    }

    @Override
    public String toString() {
        this.getAmbienteTerrestre();
        this.getAmbienteAereo();
        this.getAmbienteAquatico();
        return "";
    }


}
