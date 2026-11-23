package Aula12;

import Aula11.Visitante;

public class Main {
    static void main() {
        // Herança de implementação
        // Herança pobre
//        Visitante v1 = new Visitante();
//        v1.setNome("Juvenal");
//        v1.setIdade(22);
//        v1.setSexo("M");
//        System.out.println(v1.toString());


        // Herança para diferença
        // aluno tem tudo o que Pessoa tem, mas tem uma especialização
        // aluno é uma especialização de pessoa
        // e que pessoa é uma generalização de pessoa
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informatica");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
       // System.out.println(a1.toString());

        System.out.println("--------------------------------");
        Bolsista b1 = new Bolsista();
        b1.setMatricula(1112);
        b1.setNome("Jubileu");
        b1.setBolsa(12.5);
        b1.setSexo("M");
        b1.pagarMensalidade(); // o método é sobreposto, ele muda o comportamento de acordo

    }
}
