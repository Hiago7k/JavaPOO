package Aula13;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void locomover() {
        System.out.printf("Voando %n");
    }

    @Override
    public void alimentar() {
        System.out.printf("Comendo alpiste%n");
    }

    @Override
    public void emitirSom() {
        System.out.printf("Som de áves%n");
    }

    public void fazerNinho(){
        System.out.printf("Fazendo ninho%n");
    }
}
