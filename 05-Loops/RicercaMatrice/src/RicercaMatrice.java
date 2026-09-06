/*
    SCENARIO AZIENDALE: Ricerca di un codice ordine specifico all'interno di una
    griglia di dati (matrice 2d). Non appena trovato, si interrompe l'intera scansione.

    CONCETTI: Cicli annidati + break con etichetta
*/


public class RicercaMatrice {

    public static void main(String[] args) {

        //Simulo una giglia di codici ordine estratta da un database
        //Ogni riga è un "batch" di ordini; ogni cella è un codice univoco.
        int[][] grigliaCodici = {
                { 1001, 1002, 1003, 1004, 1005 },
                { 2010, 2020, 2030, 2040, 2050 },
                { 3100, 3200, 3300, 3400, 3500 },
                { 4001, 4002, 4003, 4004, 4005 },
                { 5500, 5600, 5700, 5800, 5900 }
        };

        int codiceDaCercare = 3300; //il codice che il sistema deve localizzare

        // Variabili per memorizzare il risultato della ricerca
        int rigaTrovata    = -1; // -1 è la sentinella: "non trovato ancora"
        int colonnaTrovata = -1;

        System.out.println("=== Sistema di Ricerca Codice Ordine ===");
        System.out.println("Codice cercato: " + codiceDaCercare);
        System.out.println("Avvio scansione griglia...");
        System.out.println();

        /*
            Etichetta sul ciclo ESTERNO
            'ricercaPrincipale è il nome dato al ciclo esterno.
            Questo nome permette di riferirsi ad esse dal ciclo interno,
            dove normalmente 'break' non arriverebbe.
        */

        ricercaPrincipale: // ← ETICHETTA: identifica il ciclo che segue
        for (int riga = 0; riga < grigliaCodici.length; riga++) {
            System.out.printf("  Scansione batch %d: ", riga);

            for(int col = 0; col < grigliaCodici[riga].length; col++) {

                int codiceCorrente = grigliaCodici[riga][col];
                System.out.printf("[ %d", codiceCorrente); //viene mostrata la scansione

                if (codiceCorrente == codiceDaCercare) {
                    //Trovato
                    rigaTrovata = riga;
                    colonnaTrovata = col;

                    System.out.println(" ] <- Trovato qui");
                    System.out.println();

                    /*
                     'break ricercaPrincipale' non esce solo dal ciclo interno (su col)
                     ma dall'intero ciclo etichettato 'ricercaPrincipale' (su riga).
                     Senza l'etichetta, userei solo 'break', che uscirebbe
                     dal for interno, ma il for esterno continuerebbe a girare
                     — scansionando inutilmente tutti i batch successivi.
                    */
                    break ricercaPrincipale;
                }

                /*
                    Questa riga viene stampata solo se il batch è stato scansionato
                    completamente senza trovare il codice. Se il 'break' con etichetta
                    è scattato, questa println non viene eseguita
                */
                if (rigaTrovata == -1) {

                    System.out.println(" ] - Non trovato in questo batch");
                }
            }
        }

        /*
            Risultato della ricerca:
            si è usciti dai cicli o perché è stato trovato il codice,
            o perché è stata scansionata l'intera griglia senza trovarlo
        */

        if (rigaTrovata != -1) {
            System.out.println("CODICE TROVATO");
            System.out.printf("  Posizione: Batch %d, Posizione %d%n",
                    rigaTrovata, colonnaTrovata);
            System.out.printf("  Valore confermato: %d%n",
                    grigliaCodici[rigaTrovata][colonnaTrovata]);
        } else {
            System.out.println("Codice " + codiceDaCercare +
                    " non presente nella griglia");
        }
    }

}
