package Aula04;

public class Caneta {
    public String modelo;
    private float ponta;
    public boolean tampada;
    public String cor;

    public Caneta(String modelo, String cor, float ponta) {
       this.modelo = modelo;
       this.cor = cor;
       this.setPonta(ponta);
       this.tampar();
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta");
        System.out.printf("Modelo: %s%n", this.getModelo());
        System.out.printf("Ponta: %.2f%n", this.getPonta());
        System.out.printf("Cor: %s%n", this.cor);
        System.out.printf("Tampada: %b%n", this.tampada);
    }

}
