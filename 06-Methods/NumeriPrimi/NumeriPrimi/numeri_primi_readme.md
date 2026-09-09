# Numeri Primi (1 - 50)

Progetto didattico in Java che individua e calcola i numeri primi compresi nell'intervallo da 1 a 50, applicando un controllo di divisibilità ottimizzato.

## Descrizione

L'applicazione scorre i numeri interi a partire da 2 fino a 50 e ne verifica la primalità tramite un metodo ausiliario dedicato (`isPrimo`).

La logica di verifica non analizza tutti i possibili divisori fino a `n - 1`, ma limita la ricerca alla radice quadrata del numero (`Math.sqrt(numero)`). Questo approccio riduce il numero di iterazioni necessarie, rendendo il controllo matematicamente più efficiente.

## Concetti e Strumenti Utilizzati

- **Metodi Ausiliari**: incapsulamento della logica di verifica all'interno del metodo statico `isPrimo(int numero)`.
- **Ottimizzazione Logica**: impiego della funzione `Math.sqrt()` per limitare la ricerca dei divisori ed evitare cicli ridondanti.
- **Operatori Aritmetici e Condizionali**: utilizzo dell'operatore modulo (`%`) per verificare la presenza di divisori senza resto.
- **Strutture di Controllo**: ciclo `for` per scorrere l'intervallo di numeri desiderato.

## Requisiti

- Java Development Kit (JDK) 8 o superiore.

## Come Eseguire il Programma

1. Scarica o clona il repository contenente il file `NumeriPrimi.java`.
2. Apri il terminale o il prompt dei comandi nella cartella in cui si trova il file.
3. Compila il sorgente Java:
   ```bash
   javac NumeriPrimi.java
   ```
4. Avvia l'applicazione:
   ```bash
   java NumeriPrimi
   ```