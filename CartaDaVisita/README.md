# Carta da Visita in Console

Un semplice programma in Java che stampa a schermo una carta da visita digitale formattata ed elegante direttamente sul terminale.

## Descrizione

Il programma definisce ed esegue una classe Java che mostra informazioni personali e di contatto (nome, professione, città, linguaggio di riferimento ed e-mail) racchiuse tra cornici di separazione e completate da una citazione finale.

I dati vengono allineati con precisione utilizzando le funzionalità di formattazione nativa delle stringhe in Java, garantendo una visualizzazione pulita e ordinata in console.

## Concetti e Strumenti Utilizzati

- **Stampa Formattata**: utilizzo del metodo `System.out.printf()` con gli specificatori di formato `%-15s`, `%s` e `%n` per allineare a sinistra le etichette impostando una larghezza fissa di 15 caratteri.
- **Manipolazione delle Stringhe**: impiego del metodo `.repeat()` della classe `String` per generare le righe divisorie della cornice.
- **Output a Console**: utilizzo di `System.out.println()` per la stampa di testo semplice, intestazioni e della citazione conclusiva.

## Requisiti

- Java Development Kit (JDK) 21 o superiore.

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `CartaDaVisita.java`.
2. Apri il terminale o il prompt dei comandi nella cartella in cui è presente il file.
3. Compila il sorgente Java:
   ```bash
   javac CartaDaVisita.java
   ```
4. Avvia l'applicazione:
   ```bash
   java CartaDaVisita
   ```
