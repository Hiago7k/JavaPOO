package Aula07;

public class main {
    static void main() {
        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Pretty Boy", 1, 3, 11, 68.9f, 1.75f, 31, "França");
        lutadores[1] = new Lutador("Putscript", 3, 2, 3, 57.8f, 1.68f, 29, "Brasil");
        lutadores[2] = new Lutador("Snapshadow", 1, 2, 12, 80.0f, 1.65f, 35, "EUA");
        lutadores[3] = new Lutador("DeadCold", 13, 2, 1, 81.6f, 1.93f, 28, "Australia");
        lutadores[4] = new Lutador("Anderson Silva", 2, 3 ,100, 90f, 1.85f, 25, "Brasil");
        lutadores[5] = new Lutador("Charles Do Bronx", 23, 10, 100, 85f, 1.83f, 27, "Brasil");

        lutadores[3].apresentar();
    }
}
