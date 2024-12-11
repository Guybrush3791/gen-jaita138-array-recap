public class App {
    public static void main(String[] args) throws Exception {

        int[] arr1 = new int[10]; // VERSIONE 1: array vuoto di 10 elementi
        int[] arr2 = { 37, 45, 12, 89, 67, 34, 56, 78, 23, 90, 1 }; // VERSIONE 2: array di 10 elementi con valori

        // Stampa array 1
        for (int x = 0; x < arr2.length; x++) {
            System.out.println("Elemento " + x + ": " + arr2[x]);
        }

        System.out.println("\n-------------------\n");

        // Sum
        // int sum = 0;
        // for (int x = 0; x < arr2.length; x++) {
        // sum += arr2[x]; // sum = sum + arr2[x];
        // }
        // System.out.println("La somma degli elementi dell'array è: " + sum);

        // // Avg
        // int avg = sum / arr2.length;
        // System.out.println("La media degli elementi dell'array è: " + avg);

        // Min
        int min = Integer.MAX_VALUE;
        for (int x = 0; x < arr2.length; x++) {

            int arrValue = arr2[x];

            if (min > arrValue) {
                min = arrValue;
            }
        }
        if (arr2.length > 0) {

            System.out.println("Il valore minimo dell'array è: " + min);
        } else {

            System.out.println("L'array è vuoto");
        }

        // Max
        int max = Integer.MIN_VALUE;
        for (int x = 0; x < arr2.length; x++) {

            int arrValue = arr2[x];

            if (max < arrValue) {
                max = arrValue;
            }
        }
        if (arr2.length > 0) {

            System.out.println("Il valore massimo dell'array è: " + max);
        } else {

            System.out.println("L'array è vuoto");
        }

        // Min e Max
        int min2 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int x = 0; x < arr2.length; x++) {

            int arrValue = arr2[x];

            if (min2 > arrValue) {
                min2 = arrValue;
            }
            if (max2 < arrValue) {
                max2 = arrValue;
            }
        }
        if (arr2.length > 0) {

            System.out.println("Il valore minimo dell'array è: " + min2);
            System.out.println("Il valore massimo dell'array è: " + max2);
        } else {

            System.out.println("L'array è vuoto");
        }

        System.out.println("\n-------------------\n");

        // Stampa i valori ad inidici dispari
        for (int x = 1; x < arr2.length; x += 2) {
            System.out.println("Elemento " + x + ": " + arr2[x]);
        }

        System.out.println("\n-------------------\n");

        // Stampa i valori dispari
        for (int x = 0; x < arr2.length; x++) {

            int arrValue = arr2[x];

            if (arrValue % 2 != 0) {
                System.out.println("Elemento " + x + ": " + arrValue);
            }
        }

        System.out.println("\n-------------------\n");

        // Ricerca di un elemento
        int searchValue = 45454;
        int searchIndex = -1;
        for (int x = 0; x < arr2.length; x++) {

            int arrValue = arr2[x];

            if (arrValue == searchValue) {

                searchIndex = x;
                break;
            }
        }
        if (searchIndex != -1) {

            System.out.println("L'elemento " + searchValue + " è presente nell'array all'indice " + searchIndex);
        } else {

            System.out.println("L'elemento " + searchValue + " non è presente nell'array");
        }

        System.out.println("\n-------------------\n");

        String str = "Hello, World!";
        for (int x = 0; x < str.length(); x++) {

            char c = str.charAt(x);

            if (c <= 'Z') {

                System.out.println("Carattere " + x + ": " + c);
            }
        }

        System.out.println("\n-------------------\n");
        System.out.println("The end");
    }
}
