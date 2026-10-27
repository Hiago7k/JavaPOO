package ExemplosAtividades;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;

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

    private void tampar() {
        this.tampada = true;
    }

    private void destampar() {
        this.tampada = false;
    }
}
