package at.fid.algoDat;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DataGeneratorTest {
    @Test
    void testGenerateDataArray() {
        int[] dataTest = DataGenerator.generateDataArray(5);
        Assert.assertEquals(dataTest.length, 5);
    }

    @Test
    void testGenerateDataArray2() {
        int[] dataTest2 = DataGenerator.generateDataArray(5, 1, 5);
        Assert.assertEquals(dataTest2.length, 5);
    }

    @Test
    void testPrintDataArray() {

    }
}
