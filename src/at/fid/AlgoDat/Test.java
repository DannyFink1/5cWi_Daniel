package at.fid.AlgoDat;

public class Test {
    public static void main(String[] args) {
        int[] dataTest = DataGenerator.generateDataArray(5);
        int[] dataTest2 = DataGenerator.generateDataArray(5, 1, 5);
        DataGenerator.printDataArray(dataTest2);
        DataGenerator.printDataArray(BasicAlgorithms.revert(dataTest2));
    }

}
