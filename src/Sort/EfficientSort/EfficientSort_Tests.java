package Sort.EfficientSort;

import org.junit.Test;

public class EfficientSort_Tests {
    private MergeSort _mergeSort;
    private int[] _unsortedSampleArray = {117,21,5,2,0,99999,25,55};
    private int[] _sortedSampleArray = {0,2,5,21,25,55,117,99999};

    @Test
    public void mergeSort() throws Exception{
        _mergeSort = new MergeSort();
        _mergeSort.mergeSort(_unsortedSampleArray);
        compare(_unsortedSampleArray, _sortedSampleArray);
    }

    /*
    * SUMMARY:  Assertion method used to check each element of a newly-sorted array,
    *               in order to determine if the array is properly sorted.
    * */
    private void compare(int[] unsorted, int[] sorted){
        for(int i = 0; i < sorted.length; i++){
            assert(unsorted[i] == sorted[i]);
        }
    }
}
