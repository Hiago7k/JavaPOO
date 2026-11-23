package Aula12;

public class Bolsista extends Aluno {
    private double bolsa;

    public void renovarBolsar(){
        System.out.printf("Renovando bolsa de %s %n", this.getNome());
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }

    // sobrepor o método do Aluno
    // se o método de pagarMensalidade do aluno fosse final
    // aqui daria erro
    // métodos final na mãe não podem ser sobrepostos
    @Override
    public void pagarMensalidade(){
        System.out.printf("%s é bolsista pagamento facilitado", this.getNome());
    }
}
