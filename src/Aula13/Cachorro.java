package Aula13;

public class Cachorro extends  Mamifero{

    public void enterrarOsso(){
        System.out.printf("Enterrando osso%n");
    }

    public void abanarRabo(){
        System.out.printf("Abanando rabo%n");
    }

    @Override
    public void emitirSom(){
        System.out.printf("au au au%n");
    }
}
