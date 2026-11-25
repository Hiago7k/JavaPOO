package ProjetoFinal;

public class Main {
    static void main() {
        Video[] v = new Video[3];

        v[0] = new Video("Aula 01 POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de SQL");

        System.out.println(v[0].toString());

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Hiago", 21, "M", "1234");
        g[1] = new Gafanhoto("Jose", 24, "M", "Abacaxi123");

        System.out.println(g[0].toString());
        System.out.println(g[1].toString());


    }
}
