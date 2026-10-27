package ExemplosAtividades;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    public void status() {
        System.out.printf("Modelo: %s%n", this.modelo);
        System.out.printf("Uma caneta: %s %n", this.cor);
        System.out.printf("Ponta: %s %n", this.ponta);
        System.out.printf("Carga: %s %n", this.carga);
        System.out.printf("Esta tampada: %b %n", this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro não posso rabiscar");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
        // this e substituido pelo nome do objeto que chamou
        // no caso c1
        // pra isso que server o this
        //c1.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
