package Aula05;

public class Aula05 {
    static void main() {
        Conta cc = new Conta();
        Conta cp = new Conta();

        cc.abrirConta("cc", "Hiago");

        System.out.println(cc.getDonoConta());
        System.out.println(cc.getSaldo());
        cc.pagarMensalidade();
        System.out.println(cc.depositar(120));
        System.out.println(cc.getSaldo());

        System.out.println(cc.sacar(20));
        System.out.println(cc.getSaldo());


        cc.sacar(88);
        cc.fecharConta("cc", "Hiago");


    }
}
