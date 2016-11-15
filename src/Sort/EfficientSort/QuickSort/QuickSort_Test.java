package Sort.EfficientSort.QuickSort;

import Sort.AlgorithmTestTools;
import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.junit.Test;

public class QuickSort_Test {

    private QuickSort _quickSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testQuickSort() throws Exception{
        _quickSort = new QuickSort();
        _quickSort.quickSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }

}
