package at.fid.AlgoSort;

import at.fid.AlgoSort.algorithms.BubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        AlgorithmTest algorithmTest = new AlgorithmTest();
        algorithmTest.setAlgorithm(bubbleSort);

        int[] testData = { 0, -4, 3, 5, 6, 7 };
        int[] newData = algorithmTest.testAlgorithm(testData);

        for (int i = 0; i < newData.length; i++) {
            System.out.println(newData[i]);
        }
    }
}
