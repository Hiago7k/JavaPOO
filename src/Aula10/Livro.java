package Aula10;

public class Livro {
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, Pessoa leitor, boolean aberto, int pagAtual, int totalPaginas, String autor) {
        this.titulo = titulo;
        this.leitor = leitor;
        this.aberto = aberto;
        this.pagAtual = pagAtual;
        this.totalPaginas = totalPaginas;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void detalhes() {
        System.out.printf("Titulo: %s | Leitor %s | Autor %s | Páginas %d | Página Atual 0  %d | Aberto %b%n",
                getTitulo(),
                leitor.getNome(),
                getAutor(),
                getTotalPaginas(),
                getPagAtual(),
                isAberto()
        );
    }
}
