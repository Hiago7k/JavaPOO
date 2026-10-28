package Aula05;

public class Conta {
    public int numConta;
    protected String tipoConta;
    private String donoConta;
    private double saldo;
    private boolean status;

    public Conta() {
        this.status = false;
        this.saldo = 0;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDonoConta() {
        return donoConta;
    }

    public void setDonoConta(String donoConta) {
        this.donoConta = donoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public boolean depositar(double valor) {
        if (valor <= 0 || !status) {
            return false;
        }

        this.saldo += valor;
        System.out.printf("Depositado com sucesso%n");
        return true;
    }

    public void abrirConta(String tipo, String donoConta, int numero) {
        if (this.tipoConta.equals("CC")) {
            this.saldo += 50f;
        }

        if (this.tipoConta.equals("CP")) {
            this.saldo += 150f;
        }

        this.donoConta = donoConta; // todos esses atributos aqui podem ser substituido pelos setters
        this.tipoConta = tipo;
        this.status = true;
        this.numConta = numero;
    }

    public void fecharConta(String tipo, String donoConta) {

        if (this.saldo > 0) {
            System.out.println("Não pode fechar conta ela possui saldo");
            return;
        }

        System.out.println("Conta fechada");
        this.status = false;
    }


    public boolean sacar(double valor) {
        if (valor > this.saldo || !status) {
            System.out.println("Saldo insuficnete");
            return false;
        }

        this.saldo -= valor;
        System.out.println("Saque realizado");
        return true;

    }


    public void pagarMensalidade() {

        if (tipoConta.equals("cc")) {
            this.saldo -= 12f;
            System.out.println("pagou taxa de 12 reais");
        }

        if (tipoConta.equals("cp")) {
            this.saldo -= 20;
            System.out.println("pagou taxa de 20 reais");
        }

    }
}
