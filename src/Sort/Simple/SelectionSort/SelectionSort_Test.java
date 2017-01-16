package Sort.Simple.SelectionSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class SelectionSort_Test {
    private SelectionSort _selectionSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void selectionSort() throws Exception{
        _selectionSort = new SelectionSort();
        _selectionSort.selectionSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
