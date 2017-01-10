package Sort.HybridSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class TreeSort_Test {
    private TreeSort _treeSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testTreeSort() throws Exception{
        _treeSort = new TreeSort();
        _testTools._unsortedSampleIntegerArray = _treeSort.treeSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
