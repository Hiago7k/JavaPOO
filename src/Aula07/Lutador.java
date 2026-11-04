package Aula07;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, int empates, int derrotas, int vitorias, float peso, float altura, int idade, String nacionalidade) {
        this.nome = nome;
        this.empates = empates;
        this.derrotas = derrotas;
        this.vitorias = vitorias;
        setPeso(peso);
        this.altura = altura;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setEmpates(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void apresentar() {
        System.out.printf("Lutador: %s%n", this.getNome());
        System.out.printf("Origem: %s%n", this.getNacionalidade());
        System.out.printf("Idade: %d%n", this.getIdade());
        System.out.printf("Altura: %.1f%n", this.getAltura());
        System.out.printf("Peso: %.1f%n", this.getPeso());
        System.out.printf("Vitorias: %d%n", this.getVitorias());
        System.out.printf("Derrotas: %d%n", this.getDerrotas());
        System.out.printf("Empates: %d%n", this.getEmpates();
    }

    public void status() {
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Peso: %.1f%n", this.getPeso());
        System.out.printf("Vitorias: %d%n", this.getVitorias());
        System.out.printf("Derrotas: %d%n", this.getDerrotas());
        System.out.printf("Empates: %d%n", this.getEmpates();
    }
}
