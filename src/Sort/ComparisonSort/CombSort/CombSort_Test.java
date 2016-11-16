package Sort.ComparisonSort.CombSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class CombSort_Test {

    private CombSort _combSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testCombSort() throws Exception{
        _combSort = new CombSort();
        _combSort.combSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}