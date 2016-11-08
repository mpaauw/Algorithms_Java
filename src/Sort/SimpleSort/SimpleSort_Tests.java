package Sort.SimpleSort;

import org.junit.Test;

public class SimpleSort_Tests {
    private InsertionSort _insertionSort;
    private SelectionSort _selectionSort;
    private int[] _unsortedSampleArray = {117,21,5,2,0,99999,25,55};
    private int[] _sortedSampleArray = {0,2,5,21,25,55,117,99999};

    @Test
    public void insertionSort() throws Exception{
        _insertionSort = new InsertionSort();
        _insertionSort.insertionSort(_unsortedSampleArray);
        compare(_unsortedSampleArray, _sortedSampleArray);
    }

    @Test
    public void selectionSort() throws Exception{
        _selectionSort = new SelectionSort();
        _selectionSort.selectionSort(_unsortedSampleArray);
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

    // test
}
