package Sort.Distribution.BucketSort;

import Sort.AlgorithmTestTools;
import org.junit.Test;

public class BucketSort_Test {
    private BucketSort _bucketSort;
    private AlgorithmTestTools _testTools = new AlgorithmTestTools();

    @Test
    public void testBucketSort() throws Exception{
        _bucketSort = new BucketSort();
        _bucketSort.bucketSort(_testTools._unsortedSampleIntegerArray);
        _testTools.compare(_testTools._unsortedSampleIntegerArray, _testTools._sortedSampleIntegerArray);
    }
}
