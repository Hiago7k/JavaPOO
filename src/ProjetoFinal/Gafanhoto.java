package ProjetoFinal;

public class Gafanhoto  extends  Pessoa{
    private String login;
    private int totAssistido;

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void viuMaisUm(){
        this.totAssistido +=1;
    }
}
