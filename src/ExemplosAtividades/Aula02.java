package ExemplosAtividades;

public class Aula02 {
    static void main() {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

        //c1.tampada = false; // referencia a atributo
        c1.rabiscar();
        c1.status();         // referencia a método

        // criar outra caneta
        System.out.println();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
