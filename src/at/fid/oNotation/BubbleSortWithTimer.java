package at.fid.oNotation;

import java.util.Scanner;
import java.util.Random;

public class BubbleSortWithTimer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Array-Größe
        System.out.print("Geben Sie die Größe des Arrays (n) ein: ");
        int n = scanner.nextInt();

        // Array mit zufälligen Zahlen füllen
        int[] array = generateRandomArray(n);

        // Zeitmessung starten
        long startTime = System.nanoTime();

        // Bubble Sort ausführen
        bubbleSort(array);

        // Zeitmessung beenden
        long endTime = System.nanoTime();

        // Laufzeit berechnen und ausgeben
        long duration = endTime - startTime;
        double durationInSeconds = duration / 1_000_000_000.0;
        System.out.println("Laufzeit des Sortierens: " + durationInSeconds + " Sekunden");

        scanner.close();
    }

    // Methode für Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Elemente tauschen
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
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
