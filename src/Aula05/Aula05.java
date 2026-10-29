package Aula05;

public class Aula05 {
    static void main() {
        Conta cc = new Conta();
        Conta cp = new Conta();
        cc.abrirConta("cc", "Hiago", 23232);
        cc.exibeRelatorio();
        cc.pagarMensalidade();

        cc.sacar(88);
        cc.fecharConta("cc", "Hiago");


    }
}
