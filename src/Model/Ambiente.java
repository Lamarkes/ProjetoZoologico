package Model;



public class Ambiente {
    Animal[] ambienteTerrestre;

    Ave[] aves;
    Aquatico[] aquatico;

    public Ambiente(int capacidadeDoAmbiente){
        ambienteTerrestre = new Animal[capacidadeDoAmbiente];
        aves = new Ave[capacidadeDoAmbiente];
        aquatico = new Aquatico[capacidadeDoAmbiente];
    }

        public void getAmbienteTerrestre() {
        for (int i = 0; i < this.ambienteTerrestre.length; i++) {
            System.out.println(ambienteTerrestre[i]);
        }
    }

    public void setAmbienteTerrestre(int posicao, Animal animal) {
        this.ambienteTerrestre[posicao] = animal;
    }

    public void getAves() {
        for (int i = 0; i < this.aves.length; i++) {
            System.out.println(aves[i]);
        }
    }

    public void setAves(int posicao, Ave aves) {
        this.aves[posicao] = aves;
    }

    public void getAquatico() {
        for (int i =0; i< this.aquatico.length; i++){
            System.out.println(aquatico[i]);
        }
    }

    public void setAquatico(int posicao, Aquatico aquatico) {
        this.aquatico[posicao] = aquatico;
    }

    @Override
    public String toString() {
        this.getAmbienteTerrestre();
        this.getAves();
        this.getAquatico();
        return "";
    }


}
