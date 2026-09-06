import java.util.Scanner;

public class Tabelline {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("=== GENERATORE DI TABELLINE ===");

        //ciclo di validazione input
        do {
            System.out.println("Inserisci un numero da 1 a 10: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Errore: devi inserire un numero intero da 1 a 10");
                scanner.next();
                System.out.println("Inserisci un intero: ");
            }

            numero = scanner.nextInt();

            if (numero < 1 || numero > 10) {
                System.out.println("Numero non valido");
                scanner.next();
            }

        } while (numero < 1 || numero > 10);

        System.out.println();
        System.out.println("=======================");
        System.out.printf("|| Tabellina del %2d  ||%n", numero);
        System.out.println("=======================");

        for (int i = 1; i <= 10; i++){
            int risultato = numero * i;
            System.out.printf("|| %2d x %2d = %3d     ||", numero, i, risultato);
            System.out.println();
        }
        System.out.println("========================");
        scanner.close();
    }
}
