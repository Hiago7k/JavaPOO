package Aula07;

public class Luta {
    private Lutador desafiado; // Agregação
    private Lutador desafiante; // Agregação
    private int rounds;
    private boolean aprovado;


    public boolean marcarLuta(Lutador desafiante, Lutador desafiado) {
        // so pode ser maracada entre lutadores da mesma categoria

        //Por estarmos usando um TIPO ABSTRATO AGRAGRAÇÃO
        // aqui no if conseguimos pegar o método getCategoria(); ele é um método da classe
        // Lutador conseguimos usar ele por estarmos usando AGRAGRAÇÃO no atributo
        if (!desafiado.getCategoria().equals(desafiante.getCategoria())) {
            System.out.println("Lutadores de categorias diferentes não podem lutar");
            return false;
        }

        // desafiante e desafiado devem ser lutadores diferentes
        if (this.desafiado == this.desafiante) {
            System.out.println("Não pode lutar com você mesmo");
            return false;
        }

        // so pode acontecer se estiver aprovado

        if (!this.aprovado) {
            System.out.println("A luta nào foi aprovado");
            return false;
        }

        // so pode ter como resultado a vitoria
        // de um dos lutadores ou empate

        this.aprovado = true;

        this.desafiado = desafiado;
        this.desafiante = desafiante;
        return true;
    }

    public void lutar() {
        if (!this.aprovado) {
            System.out.println("A luta não foi aprovado");
            return;
        }

        desafiado.apresentar();
        desafiante.apresentar();
        // vencedor 0 a 2
        double vencedor = Math.random()/Math.nextDown(0.2);

        switch ((int) vencedor) {
            case 0:
                // empate
                break;
            case 1:
                // Ganhou Desafiado
                break;
            case 2:
                // ganhou Desafiado
                break;
        }


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
