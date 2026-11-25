package Aula14;

public class Main {
    static void main() {
        Cachorro c = new Cachorro();

        c.reagir("Olá");          // Abanar e latir
        c.reagir("Vai apanhar");  // Rosnar
        c.reagir(11, 45);
        c.reagir(21, 0);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);

    }
}
