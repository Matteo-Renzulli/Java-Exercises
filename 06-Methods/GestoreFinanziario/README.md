# Gestore Finanziario

Progetto didattico in Java per il calcolo del prezzo finale di un articolo, comprensivo dell'applicazione dell'IVA, di uno sconto fedeltà basato sulla categoria del cliente e della formattazione del report di riepilogo.

## Descrizione

L'applicazione simula l'elaborazione finanziaria di un ordine a partire da un prezzo netto di base e dalla categoria di appartenenza del cliente. 

Il flusso di lavoro esegue le seguenti operazioni:
- Calcolo dell'importo con IVA applicata (es. 22%).
- Determinazione dello sconto fedeltà in base al profilo cliente (15% per la categoria GOLD, 8% per SILVER, 0% per i profili standard).
- Calcolo del prezzo totale netto da pagare.
- Stampa a console di un riepilogo dell'ordine dettagliato e formattato.

## Concetti e Strumenti Utilizzati

- **Modolarità e Principio DRY**: organizzazione della logica in metodi statici specializzati (`calcolaIVA`, `calcolaSconto`, `formattaPrezzo`, `stampaReport`) per evitare ripetizioni e garantire un codice pulito.
- **Method Overloading**: presenza di due varianti del metodo `formattaPrezzo`, una che applica di default il simbolo dell'Euro (€) e un'altra che accetta una valuta personalizzata.
- **Switch Expressions**: utilizzo della sintassi moderna delle espressioni `switch` per determinare la percentuale di sconto associata alla categoria del cliente.
- **Formattazione delle Stringhe**: impiego di `String.format()` per uniformare la rappresentazione dei valori monetari a due cifre decimali.

## Requisiti

- Java Development Kit (JDK) 14 o superiore (richiesto per l'uso delle Switch Expressions).

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `GestoreFinanziario.java`.
2. Apri il terminale o il prompt dei comandi nella cartella dove è presente il file.
3. Compila il sorgente Java:
   ```bash
   javac GestoreFinanziario.java
   ```
4. Avvia l'applicazione:
   ```bash
   java GestoreFinanziario
   ```
