package Sort.DistributionSort.CountingSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class CountingSort_Test {

    private CountingSort _countingSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testCountingSort() throws Exception{
        _countingSort = new CountingSort();
        _countingSort.countingSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
