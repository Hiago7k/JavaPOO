package Aula13;

public class Peixe extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.printf("Nadando%n");
    }

    @Override
    public void alimentar() {
        System.out.printf("Comendo Algas%n");
    }

    @Override
    public void emitirSom() {
        System.out.printf("Peixe não faz som%n");
    }

    public void fazerBolha(){
        System.out.printf("Fazendo bolha%n");
    }
}
