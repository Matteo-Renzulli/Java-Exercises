public class NumeriPrimi {
    public static void main(String[] args) {
        System.out.println("Stampa i numeri primi da 1 a 50: ");
        for (int n = 2; n <= 50; n++) {
            if (isPrimo(n)) {
                System.out.println(n + " ");
            }
        }
        System.out.println();
    }

    // test dei divisori fino alla radice quadrata
    // molto più efficiente dei test fino a n-1
    static boolean isPrimo(int numero) {
        for (int divisore = 2; divisore <= Math.sqrt(numero); divisore++) {
            if(numero % divisore == 0) {
                return false; // non è un numero primo
            }
        }
        return true; // è un numero primo
    }
}
