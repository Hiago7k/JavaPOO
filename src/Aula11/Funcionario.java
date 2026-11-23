package Aula11;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        // fazer o inverso de maneira mais simplés
        this.trabalhando = ! this.trabalhando;

// mesma coisa que aqui em cima
//        if (this.trabalhando) {
//            this.trabalhando = false;
//        } else {
//            this.trabalhando = true;
//        }
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
