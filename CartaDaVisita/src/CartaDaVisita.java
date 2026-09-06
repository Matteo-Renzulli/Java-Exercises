public class CartaDaVisita {
    public static void main(String[] args) {
        System.out.println("=".repeat(40));
        System.out.println("           CARTA DA VISITA");
        System.out.println("=".repeat(40));

        // %-15s significa: Stringa, allineata a sinistra, larga esattamente 15 caratteri
        System.out.printf("%-15s %s%n", "Nome:", "Matteo Renzulli");
        System.out.printf("%-15s %s%n", "Professione:", "Aspirante Java Developer");
        System.out.printf("%-15s %s%n", "Citta':", "Manfredonia, Italia");
        System.out.printf("%-15s %s%n", "Linguaggio:", "Java 21");
        System.out.printf("%-15s %s%n", "Email:", "matteorenzullimr@gmail.com");

        System.out.println("=".repeat(40));
        System.out.println("       \"Code is poetry.\" - Anonimo");
        System.out.println("=".repeat(40));
    }
}