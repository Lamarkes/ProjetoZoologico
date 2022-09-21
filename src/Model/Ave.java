package Model;

public class Ave {

    String nome;
    int quantidadeDeAsas;
    boolean podeVoar;
    boolean temPenas;

    public Ave(String nome, int quantidadeDeAsas, boolean podeVoar, boolean temPenas) {
        this.quantidadeDeAsas = quantidadeDeAsas;
        this.nome = nome;
        this.podeVoar = podeVoar;
        this.temPenas = temPenas;
    }

    public int getQuantidadeDeAsas() {
        return quantidadeDeAsas;
    }

    public void setQuantidadeDeAsas(int quantidadeDeAsas) {
        this.quantidadeDeAsas = quantidadeDeAsas;
    }


    public void setPodeVoar(boolean podeVoar) {
        this.podeVoar = podeVoar;
    }

    public void setTemPenas(boolean temPenas) {
        this.temPenas = temPenas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Ave{" +
                "nome='" + nome + '\'' +
                ", quantidadeDeAsas=" + quantidadeDeAsas +
                ", podeVoar=" + podeVoar +
                ", temPenas=" + temPenas +
                '}';
    }
}
