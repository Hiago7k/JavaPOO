package Aula13;

public class Main {
    static void main() {
      //  Animal animal = new Animal(); Abstrato não pode ser instanciado
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();


//        m.setPeso(35.3f);
//        m.setCorPelo("marron");
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();

        a.locomover();
        p.locomover();
        r.locomover();
    }
}
