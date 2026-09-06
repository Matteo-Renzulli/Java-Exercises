/*
PROGRAMMA: "Indovina Il Numero"
CONCETTI USATI: do-while, if-else, .hasNextInt(), Math.random(), Scanner,
                variabili int e boolean, contatore tentativi
 */

import java.util.Scanner;

public class IndovinaIlNumero {
    public static void main(String[] args) {

        //---SETUP---
        int numeroSegreto = (int)(Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);
        int tentativo = 0;
        int numeroTentativi = 0;
        boolean haVinto = false;

        //---PRESENTAZIONE---
        System.out.println("==========================================");
        System.out.println("||      INDOVINA IL NUMERO SEGRETO!     ||");
        System.out.println("||  ho pensato un numero da 1 a 100...  ||");
        System.out.println("||    quanti tentativi ti serviranno?   ||");
        System.out.println("==========================================");
        System.out.println();

        //---CICLO DI GIOCO---

        do {
            System.out.println("Tentativo n." + (numeroTentativi + 1) + " -> Inserisci un numero: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero");
                scanner.next();
                System.out.println("Inserisci un intero: ");
            }

            tentativo = scanner.nextInt();
            numeroTentativi++;

            if (tentativo < 1 || tentativo > 100) {
                System.out.println("Per favore, inserisci un numero compreso fra 1 e 100: ");
                numeroTentativi--;
                continue;
            }

            if (tentativo < numeroSegreto) {
                System.out.println("Troppo basso, il numero segreto è più grande");
            } else if (tentativo > numeroSegreto) {
                System.out.println("Troppo alto, il numero segreto è più piccolo");
            } else {
                haVinto = true;
                System.out.println();
                System.out.println("Bravo/a, hai indovinato il numero " + numeroSegreto + " !");
            }

            System.out.println();
        } while(!haVinto);

        //---STATISTICHE---
        System.out.println("-------------------------------------");
        System.out.println("   STATISTICHE PARTITA:");
        System.out.println("   Numero segreto:  " + numeroSegreto);
        System.out.println("   Tentativi usati: " + numeroTentativi);

        if (numeroTentativi == 1) {
            System.out.println("   Giudizio:  INCREDIBILE! Indovinato al primo colpo!");
        } else if (numeroTentativi <= 5) {
            System.out.println("   Giudizio:  Eccellente! Meno di 5 tentativi!");
        } else if (numeroTentativi <= 10) {
            System.out.println("   Giudizio:  Buono! Sotto i 10 tentativi.");
        } else {
            System.out.println("   Giudizio:  Ci vuole un po' di pratica!");
        }
        System.out.println("-------------------------------------");

        scanner.close();
    }
}