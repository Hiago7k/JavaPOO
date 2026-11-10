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
        if (desafiado == desafiante) {
            System.out.println("Não pode lutar com você mesmo");
            return false;
        }
        this.aprovado = true;

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
        System.out.println("Luta marcada");
        return true;
    }

    public void lutar() {
        if (!this.aprovado) {
            System.out.println("A luta não foi aprovado");
            return;
        }

        this.desafiado.apresentar();
        System.out.println("------------------------");
        this.desafiante.apresentar();
        // vencedor 0 a 2
        int min = 0;
        int max = 2;

        int vencedor = (int) (Math.random() *  ((max - min) + 1)) + min;
        System.out.println("****** Resultado da LUTA ******");
        switch ((int) vencedor) {
            case 0:
                // empate
                System.out.println("Empate");
                this.desafiante.empatarLuta();
                this.desafiado.empatarLuta();
                break;
            case 1:
                // Ganhou Desafiado
                System.out.println("Ganhou desafiado");
                this.desafiado.ganharLuta();
                this.desafiante.perderLuta();
                break;
            case 2:
                // ganhou Desafiado
                System.out.println("Ganhou desafiante");
                this.desafiante.ganharLuta();
                this.desafiado.perderLuta();
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
