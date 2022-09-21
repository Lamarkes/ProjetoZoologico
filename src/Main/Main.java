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
                "Zeus",
                2,
                true,
                true,
                true,
                true,
                "sementes"
        );

        AraraAzul araraAzul1 = new AraraAzul(
                "blue",
                2,
                true,
                true,
                "azul",
                false
        );
        Flamingo flamingo1 = new Flamingo(
                true,
                "Galinha",
                "rosa",
                2,
                true,
                true
        );

        Sardinha sardinha1 = new Sardinha(
                "Sardinha Bacana",
                2,
                false,
                "Algas",
                "Cinza",
                3
                );

        PeixePalhaco peixePalhaco1 = new PeixePalhaco(
                "Nemo",
                2,
                "vermelho-enferrujado",
                false,
                "algas"
        );

        Orca orca1 = new Orca(
                2,
                "Free Weley",
                true,
                "carnivoro",
                false
        );


        ambiente.setAmbienteTerrestre(0,leao1);
        ambiente.setAmbienteTerrestre(1,leao2);
        ambiente.setAmbienteTerrestre(2,leao3);

        ambiente.setAves(0,papagaio1);
        ambiente.setAves(1,araraAzul1);
        ambiente.setAves(2,flamingo1);

        ambiente.setAquatico(0,sardinha1);
        ambiente.setAquatico(1, peixePalhaco1);
        ambiente.setAquatico(2,orca1);

        Zoologico zoologicoRenezao = new Zoologico(
                "Zoologico ReneZao",
                ambiente

        );

        System.out.println(zoologicoRenezao.getAmbiente());

        // metodos:
        papagaio1.Bicar();
        flamingo1.BotarOvos();

        orca1.ComerPeixes();
        orca1.Nadar();

        sardinha1.Nadar();

        peixePalhaco1.Nadar();
    }
}
