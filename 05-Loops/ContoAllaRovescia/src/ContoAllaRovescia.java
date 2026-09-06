import java.util.Scanner;

public class ContoAllaRovescia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // INPUT E VALIDAZIONE
        int numero;

        do {
            System.out.println("Inserisci il numero di partenza: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Errore, il carattere inserito non è valido");
                scanner.next();
                System.out.println("Inserisci un numero intero: ");
            }

            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.println("Errore: il numero deve essere positivo");
                scanner.next();
            }

        } while (numero <= 0);

        // AVVISO PER I NUMERI GRANDI
        if (numero > 20) {
            System.out.println("Avviso: conteggio lungo. Preparati...");
        }

        System.out.println("Il conto inizia da " + numero);

        // CONTO ALLA ROVESCIA (ciclo decrescente)
        for(int i = numero; i >= 0; i--) {

            if (i == 0) {
                // prendo prima il caso particolare
                System.out.println("Partenza!");
            } else if (i % 2 != 0) {
                // è dispari
                System.out.println(i + " - Bip!");
            } else {
                // è pari
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
