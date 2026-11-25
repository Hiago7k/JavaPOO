package ProjetoFinal;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    protected void ganharExp() {
        ///
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected String getSexo() {
        return sexo;
    }

    protected void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected int getExperiencia() {
        return experiencia;
    }

    protected void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
}
