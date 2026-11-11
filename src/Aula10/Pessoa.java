package Aula10;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;


    public void fazerAniversario(){
        this.idade++;
        System.out.printf("Parabens! pelos %d%n", getIdade());
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }
}
