package Aula13;

public class Mamifero extends Animal{
    // Ao possuir métodos abstratos na super classe, obrigatoriamente
    // as subclasses precisam implementar esses mesmo métodos

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
