package at.fid.oNotation;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class SortComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Eingabe der Array-Größe
        System.out.print("Geben Sie die Größe des Arrays (n) ein: ");
        int n = scanner.nextInt();

        // Array mit zufälligen Zahlen füllen
        int[] originalArray = generateRandomArray(n);

        // Sortieralgorithmen vergleichen
        compareSortingAlgorithms(originalArray);

        scanner.close();
    }

    public static void compareSortingAlgorithms(int[] originalArray) {
        // Kopie des Arrays für jeden Algorithmus erstellen
        int[] array;

        // Selection Sort
        array = Arrays.copyOf(originalArray, originalArray.length);
        double selectionSortTime = measureTime(() -> selectionSort(array));
        System.out.println("Laufzeit von Selection Sort: " + selectionSortTime + " Sekunden");

        // Insertion Sort
        array = Arrays.copyOf(originalArray, originalArray.length);
        double insertionSortTime = measureTime(() -> insertionSort(array));
        System.out.println("Laufzeit von Insertion Sort: " + insertionSortTime + " Sekunden");

        // Bubble Sort
        array = Arrays.copyOf(originalArray, originalArray.length);
        double bubbleSortTime = measureTime(() -> bubbleSort(array));
        System.out.println("Laufzeit von Bubble Sort: " + bubbleSortTime + " Sekunden");

        // Quick Sort
        array = Arrays.copyOf(originalArray, originalArray.length);
        double quickSortTime = measureTime(() -> quickSort(array, 0, array.length - 1));
        System.out.println("Laufzeit von Quick Sort: " + quickSortTime + " Sekunden");
    }

    public static double measureTime(Runnable sortFunction) {
        long startTime = System.nanoTime();
        sortFunction.run();
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000_000.0;
    }

    // Methode für Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Methode für Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Methode für Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Methode für Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
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
