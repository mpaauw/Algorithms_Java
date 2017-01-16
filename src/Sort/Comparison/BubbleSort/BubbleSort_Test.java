package Sort.Comparison.BubbleSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class BubbleSort_Test {
    private BubbleSort _bubbleSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testBubbleSort() throws Exception{
        _bubbleSort = new BubbleSort();
        _bubbleSort.bubbleSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}