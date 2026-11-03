package Aula06;

public class ControleRemote implements Controlador {
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

    // Métodos Abstratos

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado?" + this.isLigado());
        System.out.println("Está tocando?" + this.isTocando());
        System.out.printf("Volume: %d%n", this.getVolume());

        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.printf("|");
        }

    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudar() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocando()) {
            this.setTocando(false);
        }
    }

}
