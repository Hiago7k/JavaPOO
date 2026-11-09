package Aula07;

public class Luta {
    private Lutador desafiado; // Agregação
    private Lutador desafiante; // Agregação
    private int rounds;
    private boolean aprovado;


    public boolean marcarLuta(){
        // so pode ser maracada entre lutadores da mesma categoria
        if (!desafiado.getCategoria().equals(desafiante.getCategoria())){
            System.out.println("Lutadores de categorias diferentes não podem lutar");
            return false;
        }

        // desafiante e desafiado devem ser lutadores diferentes
        if (this.desafiado == this.desafiante){
            System.out.println("Não pode lutar com você mesmo");
            return false;
        }

        return true;
    }

    public void lutar(){

    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
}
