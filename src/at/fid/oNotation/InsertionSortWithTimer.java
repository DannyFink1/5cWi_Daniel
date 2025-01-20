package at.fid.oNotation;

import java.util.Scanner;
import java.util.Random;

public class InsertionSortWithTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Array-Größe
        System.out.print("Geben Sie die Größe des Arrays (n) ein: ");
        int n = scanner.nextInt();

        // Array mit zufälligen Zahlen füllen
        int[] array = generateRandomArray(n);

        // Zeitmessung starten
        long startTime = System.nanoTime();

        // Insertion Sort ausführen
        insertionSort(array);

        // Zeitmessung beenden
        long endTime = System.nanoTime();

        // Laufzeit berechnen und ausgeben
        long duration = endTime - startTime;
        double durationInSeconds = duration / 1_000_000_000.0;
        System.out.println("Laufzeit des Sortierens: " + durationInSeconds + " Sekunden");

        scanner.close();
    }

    // Methode für Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Elemente verschieben, die größer als key sind
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }

            // key an der richtigen Stelle einfügen
            array[j + 1] = key;
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
}
