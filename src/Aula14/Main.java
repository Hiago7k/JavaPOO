package Aula14;

public class Main {
    static void main() {
        Cachorro c = new Cachorro();


        // Mesmo métodos com parâmetros diferentes que são
        // responsaveis por indentificar e chamar
        // o metodo correto
        c.reagir("Olá");          // Abanar e latir
        c.reagir("Vai apanhar");  // Rosnar
        c.reagir(11, 45);     // Abanar
        c.reagir(21, 0);      // Ignorar
        c.reagir(false);          // Rosnar e latir
        c.reagir(true);
        c.reagir(2, 12.5f); // Latir
        c.reagir(17, 4.5f); // Rosnar

    }
}
