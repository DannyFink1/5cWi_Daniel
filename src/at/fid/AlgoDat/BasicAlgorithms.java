package at.fid.algoDat;

public class BasicAlgorithms {

    public static int[] revert(int[] data) {

        int[] newData = new int[data.length];
        int counter = 0;

        for (int i = data.length - 1; i >= 0; i--) {
            newData[counter] = data[i];
            counter++;
        }
        return newData;
    }

    public static int max(int[] data) {

        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
        }
        return max;
    }

    public static int min(int[] data) {

        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

}
