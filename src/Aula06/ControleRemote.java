package Aula06;

public class ControleRemote {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais

    public ControleRemote() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
