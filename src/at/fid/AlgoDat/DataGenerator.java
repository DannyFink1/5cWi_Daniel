package at.fid.AlgoDat;

import java.util.Random;

public class DataGenerator {

    public static int[] generateDataArray(int size) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt();
        }
        return data;
    }

    public static int[] generateDataArray(int size, int min, int max) {
        Random random = new Random();
        int[] data = new int[size];
        for (int i = 0; i < size; i++) {
            data[i] = random.nextInt(min, max + 1);
        }
        return data;
    }

    public static void printDataArray(int[] data) {
        System.out.println("---- Array ----");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
        System.out.println("---------------");
    }
}
