package Aula13;

public class Main {
    static void main() {
      //  Animal animal = new Animal(); Abstrato não pode ser instanciado
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Canguru canguru = new Canguru();
        canguru.locomover();
        System.out.printf("--------------------%n");

        Cachorro bob = new Cachorro();
        bob.abanarRabo();
        bob.emitirSom();
    }
}
