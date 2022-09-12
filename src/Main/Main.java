package Main;

import Model.*;


public class Main {
    public static void main(String[] args) {
        Ambiente ambiente = new Ambiente(3);


        Leao leao1 = new Leao(
                "amarelo",
                4,
                "Mufasa",
                12,
                "leao-Africano",
                "Animal",
                "Carnivoro",
                80,
                true
        );

        Leao leao2 = new Leao(
                "Branco",
                4,
                "Nevasca",
                10,
                "leao-branco",
                "Animal",
                "Carnivoro",
                94,
                false

        );Leao leao3 = new Leao(
                "amarelo",
                4,
                "Simba",
                13,
                "leao-sul-africano",
                "Animal",
                "Carnivoro",
                94,
                true

        );

        Papagaio papagaio1 = new Papagaio(
                "Lula",
                4,
                "Papagaio-Verdadeiro",
                "Animal",
                105,
                true,
                true,
                false,
                "Frutifero"
        );

        AraraAzul araraAzul1 = new AraraAzul("Blue",
                4,
                "Arara-azul",
                "Animal",
                0.90,
                false,
                "sementes",
                "Azul",
                true
                );
        Flamingo flamingo1 = new Flamingo(
                "Galinha",
                6,
                "Flamingo Viajante",
                "Animal",
                4,
                false,
                "Peixe e sementes",
                true,
                "Rosa"
        );

        Sardinha sardinha1 = new Sardinha(
                "Sardinha",
                4,
                "Srdinha vermelha",
                "Aquatico",
                0.9,
                true,
                "amarela",
                2,
                "Algas"
                );

        PeixePalhaco peixePalhaco1 = new PeixePalhaco(
                "Nemo",
                7,
                "Peixe-palhaco",
                "Aquatico",
                0.43,
                false,
                "algas",
                "laranja"
        );

        Orca orca1 = new Orca(
                "Free Wiely",
                8,
                "Orca-Assassina",
                "Animal",
                198,
                false,
                "peixes",
                3,
                true
        );


        ambiente.setAmbienteTerrestre(0,leao1);
        ambiente.setAmbienteTerrestre(1,leao2);
        ambiente.setAmbienteTerrestre(2,leao3);

        ambiente.setAmbienteAereo(0,papagaio1);
        ambiente.setAmbienteAereo(1,araraAzul1);
        ambiente.setAmbienteAereo(2,flamingo1);

        ambiente.setAmbienteAquatico(0,sardinha1);
        ambiente.setAmbienteAquatico(1, peixePalhaco1);
        ambiente.setAmbienteAquatico(2,orca1);

        Zoologico zoologicoRenezao = new Zoologico(
                "Zoologico ReneZao",
                ambiente

        );

        System.out.println(zoologicoRenezao.getAmbiente());

    }
}
