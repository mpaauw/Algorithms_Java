package Sort.SimpleSort.InsertionSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class InsertionSort_Test {
    private InsertionSort _insertionSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void insertionSort() throws Exception{
        _insertionSort = new InsertionSort();
        _insertionSort.insertionSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }

}
