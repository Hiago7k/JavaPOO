package Aula12;

import Aula11.Visitante;

public class Main {
    static void main() {
        Visitante v1 = new Visitante();
        v1.setNome("Juvenal");
        v1.setIdade(22);
        v1.setSexo("M");
        System.out.println(v1.toString());

    }
}
