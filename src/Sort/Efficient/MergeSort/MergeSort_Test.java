package Sort.Efficient.MergeSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class MergeSort_Test {
    private MergeSort _mergeSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void mergeSort() throws Exception{
        _mergeSort = new MergeSort();
        _mergeSort.mergeSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
