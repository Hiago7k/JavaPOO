package Aula10;

public class Livro implements Publicacao {
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        if (isAberto()) {
            System.out.println("Erro já esta aberto!");
            return;
        }

        System.out.printf("Aberto%n");
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        if (!isAberto()) {
            System.out.printf("Já esta fechado!%n");
            return;
        }

        System.out.printf("Fechado%n");
        this.setAberto(false);
    }

    @Override
    public void folhar() {
        if (!isAberto()) {
            System.out.printf("Erro, precisa abrir antes de folhar!%n");
            return;
        }
        System.out.printf("Folhando....%n");
    }

    @Override
    public void avancarPag() {
        if (!isAberto()) {
            System.out.printf("Erro, precisa abrir antes de avançar página!%n");
            return;
        }

        if (pagAtual >= getTotalPaginas()) {
            System.out.printf("Acabou ás páginas!%n");
            System.out.printf("Página atual %d | Total de páginas %d%n", getPagAtual(), getTotalPaginas());
            return;
        }

        this.pagAtual++;
        System.out.printf("Avançando para página %d%n", this.getPagAtual());
    }

    @Override
    public void voltarPag() {
        if (!isAberto()) {
            System.out.printf("Erro, precisa abrir antes de voltar página!%n");
            return;
        }

        if (pagAtual <= 1) {
            System.out.printf("Você está no inicio não pode voltar a página%n");
            return;
        }

        this.setPagAtual(this.getPagAtual() - 1);
        System.out.printf("Voltando página você voltou para %d%n", getPagAtual());

    }
}
