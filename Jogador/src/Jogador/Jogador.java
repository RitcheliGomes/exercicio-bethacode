package Jogador;

public class Jogador {

    private String nome;
    private int forca;
    private String historicoCombate="";

    public String getHistoricoCombate() {
        return historicoCombate;
    }

    public void setHistoricoCombate(String historicoCombate) {
        this.historicoCombate += historicoCombate + "\n";
    }
    public void imprimirHistorico(){
        System.out.println(getHistoricoCombate());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void chute() {
        forca -= 10;
        String texto = "o jogador" + nome + " usou o chute :: FORÇA ATUALIZADA:: " + forca;
        System.out.println(texto);
        this.setHistoricoCombate(texto);
    }

    public void soco() {
        forca -= 5;
        String texto = " o jogador " + nome + " usou o soco :: FORÇA ATUALIZADA::" + forca;
        System.out.println(texto);
        this.setHistoricoCombate(texto);
    }

    public void beberAgua() {
        forca += 15;
        String texto = " o jogador " + nome + " bebeu agua :: FORÇA ATUALIZADA::" + forca;
        System.out.println(texto);
        this.setHistoricoCombate(texto);
    }

    public void comerPao() {
        forca += 30;
        String texto = " o jogador " + nome + " comeu pão :: FORÇA ATUALIZADA:: " + forca;
        System.out.println(texto);
        this.setHistoricoCombate(texto);
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", forca=" + forca +
                '}';
    }
}
