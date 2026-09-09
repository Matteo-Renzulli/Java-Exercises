import java.util.Scanner;

public class ConvertitoreValuteModulare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mostraMenu();

        System.out.println("Valuta di partenza (EUR/USD/GBP): ");
        String valutaDa = sc.next().toUpperCase();

        System.out.println("Valuta di destinazione (EUR/USD/GBP): ");
        String valutaA = sc.next().toUpperCase();

        System.out.println("Importo da convertire: ");
        double importo = sc.nextDouble();

        //Validazione: se l'importo non è valido, termina con un messaggio di errore
        if (!validaImporto(importo)) {
            System.out.println("Errore, l'importo deve avere un valore positivo");
            return;
        }

        double risultato = converti(importo, valutaDa, valutaA);
        stampaReport(importo, valutaDa, risultato, valutaA);
    }

    static void mostraMenu() {
        System.out.println("========================================");
        System.out.println("    Convertitore di valute modulare     ");
        System.out.println("========================================");
        System.out.println("   Valute supportate: EUR, USD, GBP     ");
        System.out.println("========================================");
    }

    //restituisce true se l'importo è accettabile, altrimenti false
    static boolean validaImporto(double importo) {
        return importo > 0.0;
    }

    // Esegue la conversione tra due valute usando tassi di cambio fissi
    // Restituisce -1.0 se la combinazione di valute non è supportata
    static double converti(double importo, String da, String a) {
        //caso base: stessa valuta, nessuna conversione necessaria
        if (da.equals(a)) return importo;

        //si costruisce la chiave di conversione unendo le due valute
        String chiave = da + "_" + a;

        double tasso = switch (chiave) {
            case "EUR_USD" -> 1.08;
            case "EUR_GBP" -> 0.86;
            case "USD_EUR" -> 0.93;
            case "USD_GBP" -> 0.79;
            case "GBP_EUR" -> 1.16;
            case "GBP_USD" -> 1.27;
            default -> -1.0;  // Combinazione non supportata
        };

        if (tasso < 0) {
            System.out.println("Conversione " + da + "_" + a + " non supportata");
            return -1.0;
        }
        return importo * tasso;
    }

    // Stampa un report formattato con il risultato della conversione.
    static void stampaReport(double orig, String valDa, double conv, String valA) {
        if (conv < 0) return; // Non stampare se la conversione è fallita

        System.out.println();
        System.out.println(" ───────────────────────────────────── ");
        System.out.println("│         REPORT DI CONVERSIONE       │");
        System.out.println(" ───────────────────────────────────── ");
        System.out.printf("│  Importo originale: %10.2f %-4s │%n", orig, valDa);
        System.out.printf("│  Importo convertito:%10.2f %-4s │%n", conv, valA);
        System.out.println(" ───────────────────────────────────── ");

    }
}