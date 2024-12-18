package at.fid.algoDat;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BasicAlgorithmsTest {
    @Test
    void testMax() {
        int[] data = { 0, -5, 2, 3, 4 };
        int max = BasicAlgorithms.max(data);
        Assert.assertEquals(4, max);
    }

    @Test
    void testMin() {
        int[] data = { 0, -5, 2, 3, 4 };
        int min = BasicAlgorithms.min(data);
        Assert.assertEquals(-5, min);
    }

    @Test
    void testRevert() {
        int[] data = { 0, -5, 2, 3, 4 };
        int[] revertTest = { 4, 3, 2, -5, 0 };
        int[] newData = BasicAlgorithms.revert(data);
        Assert.assertArrayEquals(revertTest, newData);
    }
}
