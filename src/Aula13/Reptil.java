package Aula13;

public class Reptil extends Animal{
   private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.printf("Rastejando %n");
    }

    @Override
    public void alimentar() {
        System.out.printf("Comendo insetos%n");
    }

    @Override
    public void emitirSom() {
        System.out.printf("Som de réptil%n");
    }
}
