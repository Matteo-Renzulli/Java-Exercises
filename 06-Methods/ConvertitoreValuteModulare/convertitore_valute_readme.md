# Convertitore di Valute Modulare

Progetto didattico in Java che implementa un convertitore di valute da console. L'applicazione permette di effettuare conversioni tra Euro (EUR), Dollari Statunitensi (USD) e Sterline Britanniche (GBP) applicando tassi di cambio fissi.

## Descrizione

L'applicazione acquisisce da tastiera la valuta di origine, la valuta di destinazione e l'importo che l'utente desidera convertire. 

Il flusso di esecuzione prevede:
- La visualizzazione di un menu con le valute supportate.
- La lettura e normalizzazione in maiuscolo dei codici valuta.
- La validazione dell'importo per assicurarsi che sia strettamente positivo.
- Il calcolo della conversione tramite una chiave composta basata sulla coppia di valute.
- La stampa a schermo di un report di riepilogo con i dati formattati.

## Concetti e Strumenti Utilizzati

- **Architettura Modulare**: separazione delle responsabilità attraverso metodi statici dedicati (`mostraMenu`, `validaImporto`, `converti`, `stampaReport`).
- **Gestione dell'Input**: utilizzo della classe `Scanner` per la lettura dinamica delle stringhe e dei numeri decimali da console.
- **Validazione dei Dati**: controllo preventivo dell'importo mediante il metodo `validaImporto` prima di procedere al calcolo.
- **Switch Expressions**: impiego della sintassi dello `switch` con espressioni `->` e combinazione di stringhe (es. `"EUR_USD"`) per selezionare in modo chiaro il tasso di cambio applicabile.
- **Output Formattato**: utilizzo di `System.out.printf()` per l'allineamento preciso delle cifre decimali e dei codici valuta all'interno della cornice del report.

## Requisiti

- Java Development Kit (JDK) 14 o superiore (richiesto per l'utilizzo delle Switch Expressions).

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `ConvertitoreValuteModulare.java`.
2. Apri il terminale o il prompt dei comandi nella cartella in cui si trova il file.
3. Compila il file Java:
   ```bash
   javac ConvertitoreValuteModulare.java
   ```
4. Avvia l'applicazione:
   ```bash
   java ConvertitoreValuteModulare
   ```