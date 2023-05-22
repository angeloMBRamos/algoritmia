package poo_fp_rpg.entidades;

abstract public class Entidade {

    private String nome;
    private int vida;
    private int forca;

    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getForca() {
        return forca;
    }

    abstract public void mostrarDetalhes();
}