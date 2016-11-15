package Sort;

public class AlgorithmTestTools {

    public int[] _unsortedSampleIntegerArray = {117,21,5,2,0,99999,25,55};
    public int[] _sortedSampleIntegerArray = {0,2,5,21,25,55,117,99999};

    /*
    * SUMMARY:  Assertion method used to check each element of a newly-sorted array,
    *               in order to determine if the array is properly sorted.
    * */
    public void compare(int[] unsorted, int[] sorted){
        for(int i = 0; i < sorted.length; i++){
            assert(unsorted[i] == sorted[i]);
        }
    }
}
