package ExemplosAtividades;

public class Aula02 {
    static void main() {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        c1.carga = 23;
        c1.destampar();
        c1.status();

        c1.rabiscar();
    }
}
