package Aula13;

public class Canguru extends Mamifero{


    public void usarBolsa(){
        System.out.printf("usando bolsa%n");
    }

    @Override
    public void locomover() {
        System.out.printf("Pulando %n");
    }
}
