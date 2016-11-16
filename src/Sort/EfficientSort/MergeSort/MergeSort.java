package Sort.EfficientSort.MergeSort;

import javax.print.DocFlavor;
import java.util.Arrays;

/*
* SUMMARY:  Class that includes various efficient sorting algorithms.
*           https://en.wikipedia.org/wiki/Sorting_algorithm#Efficient_sorts
* */
public class MergeSort {

    private static int[] _array;
    private static int[] _temp;
    private static int _length;

    /*
    * SUMMARY:  Takes an unsorted array and performs a Merge Sort on it, using a top-down array implementation.
    *           Efficiency: O(n log(n))
    * */
    public void mergeSort(int[] inputArray) {
        _array = inputArray;
        _length = inputArray.length;
        _temp = new int[_length];
        sort(0, _length - 1);
    }

    /*
    * SUMMARY:  To be used in tandem with the mergeSort function; used to recursively sort arrays of varying size.
    * */
    private static void sort(int lowIndex, int highIndex){
        if(lowIndex < highIndex){
            int middle = lowIndex + (highIndex - lowIndex) / 2;
            sort(lowIndex, middle);
            sort(middle + 1, highIndex);
            merge(lowIndex, highIndex, middle);
        }
    }

    /*
    * SUMMARY: To be used in tandem with the mergeSort function; used to merge two sorted arrays together.
    * */
    private static void merge(int lowIndex, int highIndex, int middle) {
        for(int i = lowIndex; i <= highIndex; i++){
            _temp[i] = _array[i];
        }
        int i = lowIndex, j = middle + 1, k = lowIndex;
        while(i <= middle && j <= highIndex){
            if(_temp[i] <= _temp[j]){
                _array[k] = _temp[i];
                i++;
            }
            else{
                _array[k] = _temp[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            _array[k] = _temp[i];
            k++;
            i++;
        }
    }
}