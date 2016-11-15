package Sort.EfficientSort.HeapSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class HeapSort_Test {
    private HeapSort _heapSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void heapSort() throws Exception{
        _heapSort = new HeapSort();
        _heapSort.heapSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
