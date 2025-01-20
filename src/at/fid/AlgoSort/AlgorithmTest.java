package at.fid.algoSort;

import at.fid.algoSort.algorithms.Algorithm;

public class AlgorithmTest {
    private Algorithm algorithm;

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public int[] testAlgorithm(int[] data) {
        return algorithm.sort(data);
    }
}
