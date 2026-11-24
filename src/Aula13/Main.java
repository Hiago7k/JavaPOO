package Aula13;

public class Main {
    static void main() {
      //  Animal animal = new Animal(); Abstrato não pode ser instanciado
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru canguru = new Canguru();
        Cachorro bob = new Cachorro();
        Cobra cobra = new Cobra();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();

        canguru.locomover();
        bob.locomover();
        bob.emitirSom();
    }
}
