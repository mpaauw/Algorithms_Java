package Sort.Comparison.ShellSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class ShellSort_Test {

    private ShellSort _shellSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testShellSort() throws Exception{
        _shellSort = new ShellSort();
        _shellSort.shellSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
