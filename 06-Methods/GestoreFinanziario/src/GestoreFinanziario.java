/*
    Gestore finanziario per il calcolo dell'iva e sconti. Il programma calcolerà
    il prezzo finale di un articolo applicando l'iva, uno sconto fedeltà in base
    alla categoria del cliente e formatterà il risultato
    Uso dei metodi, de method overloading e del tipo di ritorno void.
    Uso del principio DRY
 */

public class GestoreFinanziario {

    // entry point
    public static void main(String[] args) {

        System.out.println("GESTORE FINANZIARIO");

        double prezzoNetto       = 149.99;
        String categoriaCliente  = "GOLD";

        double prezzoConIVA  = calcolaIVA(prezzoNetto, 0.22);
        double sconto        = calcolaSconto(prezzoConIVA, categoriaCliente);
        double prezzoFinale  = prezzoConIVA - sconto;

        stampaReport(prezzoNetto, prezzoConIVA, sconto, prezzoFinale, categoriaCliente);
    }

    // METODO 1: calcola il prezzo iva inclusa
    public static double calcolaIVA(double prezzoNetto, double aliquotaIVA) {
        return prezzoNetto * (1 + aliquotaIVA);
    }

    // METODO 2: calcola lo sconto in base alla categoria del cliente
    public static double calcolaSconto(double prezzoLordo, String categoria) {
        double percentualeSconto;

        switch (categoria.toUpperCase()) {
            case "GOLD" -> percentualeSconto = 0.15;
            case "SILVER" -> percentualeSconto = 0.08;
            default -> percentualeSconto = 0.00;
        }

        return prezzoLordo * percentualeSconto;
    }

    // METODO 3a: formatta un prezzo (default euro)
    public static String formattaPrezzo(double importo) {
        return String.format("€ %.2f", importo);
    }

    // METODO 3b: formatta un prezzo con valuta personalizzata (overloading)
    public static String formattaPrezzo(double importo, String simboloValuta) {
        return String.format("%s %.2f", simboloValuta, importo);
    }

    public static void stampaReport(double netto, double lordo, double sconto, double finale, String categoria) {
        System.out.println();
        System.out.println("  RIEPILOGO ORDINE  ");
        System.out.println("Prezzo netto : " + formattaPrezzo(netto));
        System.out.println("IVA 22% :" + formattaPrezzo(lordo-netto));
        System.out.println("Prezzo lordo : " + formattaPrezzo(lordo));
        System.out.println("Sconto fedeltà [" + categoria + "] : -" + formattaPrezzo(sconto));
        System.out.println("----------------------------------------");
        System.out.println("TOTALE DA PAGARE : " + formattaPrezzo(finale));

    }
}
