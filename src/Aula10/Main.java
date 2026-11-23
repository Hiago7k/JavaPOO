package Aula10;

public class Main {
    static void main() {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");

        l[0] = new Livro("Aprendendo java", p[0], 300, "Pedro");
        l[1] = new Livro("POO para iniciantes", p[1], 532, "Gustavo Guanabara");
        l[2] = new Livro("Java advanced", p[1], 882, "Maria Candis");

        l[0].abrir();
        l[0].folhar(123);
        l[0].detalhes();


        l[1].detalhes();
        l[2].detalhes();

    }
}
