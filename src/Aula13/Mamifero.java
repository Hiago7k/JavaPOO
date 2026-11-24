package Aula13;

public class Mamifero extends Animal{
    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    @Override
    public void locomover(){
        System.out.printf("Correndo%n");
    }

    @Override
    public void alimentar(){
        System.out.printf("Bebendo leite%n");
    }

    @Override
    public void emitirSom(){
        System.out.printf("Som de mamifero%n");
    }
}
