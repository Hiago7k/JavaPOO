package ExemplosAtividades;

public class Aula02 {
    static void main() {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal"; // publico permite modificar
        c1.cor = "Azul"; // publico permite modificar
        //c1.ponta = 0.5f; // da erro por que é privado não conseguimos modificar
        c1.carga = 23; // não deu erro por que a main está utilizando o método c1 que é uma centa
        // então ele deixa por que esta dentro de uma classe que utiliza classe Caneta
       // c1.tampada = true;
        c1.destampar();
        c1.status();

        c1.rabiscar();
    }
}
