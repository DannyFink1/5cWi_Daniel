package at.fid.AlgoSort.algorithms;

import java.util.List;

public class BubbleSort implements Algorithm {

    @Override
    public int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int e = 0; e < data.length - 1; e++) {
                if (data[e] > data[e + 1]) {
                    int temp = data[e];
                    data[e] = data[e + 1];
                    data[e + 1] = temp;
                }
            }
        }
        return data;
    }

}
