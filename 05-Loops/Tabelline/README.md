# Generatore di Tabelline

Progetto didattico in Java da console che richiede all'utente un numero intero compreso tra 1 e 10 e ne genera la relativa tabellina, stampando i risultati all'interno di una cornice ordinata.

## Descrizione

L'applicazione guida l'utente nell'inserimento di un valore e ne calcola le moltiplicazioni da 1 a 10.

Il programma include una gestione robusta dell'input:
- Controlla che il dato inserito sia effettivamente un numero intero.
- Verifica che il numero rientri nell'intervallo consentito (da 1 a 10), mostrando un messaggio di errore e richiedendo nuovamente l'inserimento in caso di valore fuori scala o non valido.

Una volta convalidato l'input, il ciclo di calcolo genera la tabella con i singoli prodotti e li mostra a schermo mantenendo le cifre perfettamente allineate.

## Concetti e Strumenti Utilizzati

- **Gestione e Validazione dell'Input**: utilizzo della classe `Scanner` e del metodo `.hasNextInt()` per controllare il tipo di dato prima della lettura, evitando eccezioni a runtime.
- **Strutture di Controllo**: ciclo `do-while` e `while` annidato per garantire la correttezza dell'input e ciclo `for` per eseguire le dieci iterazioni di calcolo.
- **Stampa Formattata**: impiego di `System.out.printf()` con specificatori di ampiezza (`%2d`, `%3d`) per allineare i numeri e preservare la struttura visiva della tabella.

## Requisiti

- Java Development Kit (JDK) 8 o superiore.

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `Tabelline.java`.
2. Apri il terminale o il prompt dei comandi nella cartella in cui si trova il file.
3. Compila il sorgente Java:
   ```bash
   javac Tabelline.java
   ```
4. Avvia l'applicazione:
   ```bash
   java Tabelline
   ```
