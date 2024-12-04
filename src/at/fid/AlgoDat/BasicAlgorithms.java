package at.fid.AlgoDat;

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
}
