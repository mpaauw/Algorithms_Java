package Sort.DistributionSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class RadixSort_Test {
    private RadixSort _radixSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testRadixSort() throws Exception{
        _radixSort = new RadixSort();
        _radixSort.radixSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
