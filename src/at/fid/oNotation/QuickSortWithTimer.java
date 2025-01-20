package at.fid.oNotation;

import java.util.Scanner;
import java.util.Random;

public class QuickSortWithTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Array-Größe
        System.out.print("Geben Sie die Größe des Arrays (n) ein: ");
        int n = scanner.nextInt();

        // Array mit zufälligen Zahlen füllen
        int[] array = generateRandomArray(n);

        // Zeitmessung starten
        long startTime = System.nanoTime();

        // Quick Sort ausführen
        quickSort(array, 0, array.length - 1);

        // Zeitmessung beenden
        long endTime = System.nanoTime();

        // Laufzeit berechnen und ausgeben
        long duration = endTime - startTime;
        double durationInSeconds = duration / 1_000_000_000.0;
        System.out.println("Laufzeit des Sortierens: " + durationInSeconds + " Sekunden");

        scanner.close();
    }

    // Methode für Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Pivot-Index finden
            int pi = partition(array, low, high);

            // Rekursiv sortieren
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // Methode zur Partitionierung des Arrays
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // Elemente tauschen
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Pivot an die richtige Stelle setzen
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Methode zur Generierung eines Arrays mit zufälligen Zahlen
    public static int[] generateRandomArray(int n) {
        Random random = new Random();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000); // Zufällige Zahlen zwischen 0 und 999
        }

        return array;
    }
}
