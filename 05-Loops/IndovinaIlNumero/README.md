# Indovina il Numero

Progetto didattico in Java che implementa un classico gioco da console: l'applicazione genera un numero intero casuale compreso tra 1 e 100 e guida l'utente verso la soluzione fornendo un feedback in tempo reale.

## Descrizione

All'avvio della partita, il programma elabora un numero segreto. L'utente ha a disposizione tentativi illimitati per indovinarlo. Dopo ogni inserimento, il sistema indica se il numero da trovare è più grande o più piccolo rispetto al valore digitato. 

Il codice include controlli per la gestione degli errori di input:
- Verifica che il valore inserito sia effettivamente un numero intero.
- Controlla che il numero rientri nell'intervallo consentito (da 1 a 100), evitando di incrementare il contatore dei tentativi in caso di valore fuori scala.

Al termine del gioco, vengono mostrate le statistiche finali con un giudizio sulle prestazioni calcolato in base al numero di tentativi utilizzati.

## Concetti e Strumenti Utilizzati

- **Gestione dell'Input**: utilizzo della classe `Scanner` per la lettura dei dati da console.
- **Validazione dei Dati**: impiego del metodo `.hasNextInt()` per verificare la correttezza del tipo di dato inserito e prevenire eccezioni.
- **Generazione Casuale**: utilizzo di `Math.random()` per generare numeri casuali nell'intervallo 1-100.
- **Strutture di Controllo**: ciclo `do-while` per ripetere il flusso di gioco fino alla vittoria e istruzioni `if-else` per i confronti logici.
- **Variabili di Stato**: gestione del punteggio e dello stato del gioco tramite variabili di tipo `int` e `boolean`.

## Requisiti

- Java Development Kit (JDK) 8 o superiore.

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `IndovinaIlNumero.java`.
2. Apri il terminale o il prompt dei comandi nella cartella in cui si trova il file.
3. Compila il file Java:
   ```bash
   javac IndovinaIlNumero.java
   ```
4. Avvia l'applicazione:
   ```bash
   java IndovinaIlNumero
   ```
