# Ricerca in Matrice 2D con Labeled Break

Progetto didattico in Java che simula uno scenario aziendale di ricerca all'interno di una griglia di dati multidimensionale. L'applicazione analizza una matrice 2D di codici ordine suddivisi in batch e ne individua la posizione esatta interrompendo l'intera scansione non appena il valore viene trovato.

## Descrizione

Il programma riproduce un sistema di tracciamento ordini aziendale. La griglia di dati è rappresentata da una matrice bidimensionale (`int[][]`), dove ogni riga simula un batch di produzione o spedizione e ogni cella contiene un codice ordine univoco.

Il sistema ricerca un codice specifico (impostato nel codice come `3300`) stampando a console l'avanzamento della scansione per ciascun batch. Quando il codice viene individuato, l'esecuzione si interrompe immediatamente attraverso un'istruzione `break` con etichetta, evitando di analizzare i batch restanti. Vengono poi mostrati la posizione esatta (numero di batch e posizione) e il valore confermato. Se il codice non è presente nella griglia, il programma notifica l'assenza del dato.

## Concetti e Strumenti Utilizzati

- **Matrici 2D**: utilizzo di array bidimensionali (`int[][]`) per rappresentare e gestire dati organizzati in righe e colonne.
- **Cicli Annidati e Labeled Break**: impiego di cicli `for` sovrapposti abbinati a un'etichetta (`ricercaPrincipale:`) per uscire direttamente dal ciclo esterno al momento del match, evitando iterazioni superflue.
- **Variabili Sentinella**: utilizzo di variabili di controllo inizializzate a `-1` (`rigaTrovata` e `colonnaTrovata`) per verificare l'esito della ricerca.
- **Output Formattato**: impiego di `System.out.printf()` per visualizzare a schermo il flusso della scansione e i risultati finali in modo ordinato.

## Requisiti

- Java Development Kit (JDK) 8 o superiore.

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `RicercaMatrice.java`.
2. Apri il terminale o il prompt dei comandi nella cartella del file.
3. Compila il sorgente Java:
   ```bash
   javac RicercaMatrice.java
   ```
4. Avvia l'applicazione:
   ```bash
   java RicercaMatrice
   ```
