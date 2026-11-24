package Aula14;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.printf("Au! au! au!%n");
    }

    public void reagir(String frase) {
        if (frase.equals("Toma comida") || frase.equals("Olá") || frase.equals("bob")) {
            System.out.printf("Abanar e latir%n");
        } else {
            System.out.printf("Rosnar%n");
        }
    }

    public void reagir(int hora, int min) {
        if (hora < 12) {
            System.out.printf("Abanar%n");
        } else if (hora >= 18) {
            System.out.printf("Ignorar%n");
        } else {
            System.out.printf("Abanar e latir%n");
        }
    }


    public void reagir(boolean dono) {
        if (dono) {
            System.out.printf("Abanar e latir%n");
        } else {
            System.out.printf("Rosnar e latir%n");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.printf("Abanar%n");
            } else {
                System.out.printf("Latir %n");
            }
        } else {
            if (peso < 10) {
                System.out.printf("Rosnar %n");
            } else {
                System.out.printf("Ignorar%n");
            }
        }
    }
}
