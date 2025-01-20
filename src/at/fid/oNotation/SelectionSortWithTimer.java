
package at.fid.oNotation;

import java.util.Scanner;
import java.util.Random;

public class SelectionSortWithTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Array-Größe
        System.out.print("Geben Sie die Größe des Arrays (n) ein: ");
        int n = scanner.nextInt();

        // Array mit zufälligen Zahlen füllen
        int[] array = generateRandomArray(n);

        // Zeitmessung starten
        long startTime = System.nanoTime();

        // Selection Sort ausführen
        selectionSort(array);

        // Zeitmessung beenden
        long endTime = System.nanoTime();

        // Sortiertes Array ausgeben^

        // Laufzeit berechnen und ausgeben
        long duration = endTime - startTime;
        double durationInSeconds = duration / 1_000_000_000.0;
        System.out.println("\nLaufzeit des Sortierens: " + durationInSeconds + " Sekunden");

        scanner.close();
    }

    // Methode für Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            // Index des kleinsten Elements finden
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Kleinste Element mit dem aktuellen Element tauschen
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
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

    // Methode zum Ausgeben eines Arrays
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
