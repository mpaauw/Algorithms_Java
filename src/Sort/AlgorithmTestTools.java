package Sort;

import java.util.Arrays;
import java.util.Random;

public class AlgorithmTestTools {

    Random _randomizer = new Random();
    public int[] _unsortedSampleIntegerArray;
    public int[] _sortedSampleIntegerArray;
    private int _sampleIntegerArraySize;
    private final int UPPER_BOUND = 200000;

    public AlgorithmTestTools(){
        int size = _randomizer.nextInt(UPPER_BOUND) + 1;
        _sampleIntegerArraySize = size;
        _unsortedSampleIntegerArray = new int[_sampleIntegerArraySize];
        _sortedSampleIntegerArray = new int[_sampleIntegerArraySize];
        populate();
        sort();
    }

    /*
    * SUMMARY:  Assertion method used to check each element of a newly-sorted array,
    *               in order to determine if the array is properly sorted.
    * */
    public void compare(int[] unsorted, int[] sorted){
        for(int i = 0; i < sorted.length; i++){
            assert(unsorted[i] == sorted[i]);
        }
    }

    private void populate(){
        for(int i = 0; i < _unsortedSampleIntegerArray.length; i++){
            int random = _randomizer.nextInt(UPPER_BOUND * 2) - UPPER_BOUND;
            _unsortedSampleIntegerArray[i] = random;
            _sortedSampleIntegerArray[i] = random;
        }

        // Run assertions on both arrays to ensure that all values are equivalent when unsorted:
        for(int i = 0; i < _sampleIntegerArraySize; i++){
            assert(_unsortedSampleIntegerArray[i] == _sortedSampleIntegerArray[i]);
        }
    }

    private void sort(){
        Arrays.sort(_sortedSampleIntegerArray);
    }
}
