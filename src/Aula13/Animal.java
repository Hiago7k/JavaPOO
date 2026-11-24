package Aula13;

public abstract class Animal {
    private float peso;
    private int idade;
    private int membros;

    // Métodos abstratos não possuem lógica
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();
}
