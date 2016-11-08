package Sort.EfficientSort;

import java.util.Arrays;

/*
* SUMMARY:  Class that includes various efficient sorting algorithms.
*           https://en.wikipedia.org/wiki/Sorting_algorithm#Efficient_sorts
* */
public class MergeSort {

    /*
    * SUMMARY:  Takes an unsorted array and performs a Merge Sort on it, using a top-down array implementation.
    *           Efficiency: O(n log(n))
    * */
    public static void mergeSort(int[] inputArray) {
        if(inputArray.length < 2){
            return;
        }
        int mid = inputArray.length / 2;
        int[] leftSort = Arrays.copyOfRange(inputArray, 0, mid);
        int[] rightSort = Arrays.copyOfRange(inputArray, mid, inputArray.length);
        mergeSort(leftSort);
        mergeSort(rightSort);
        merge(leftSort, rightSort, inputArray);
    }

    /*
    * SUMMARY: To be used in tandem with the mergeSort function; used to merge two sorted arrays together.
    * */
    private static void merge(int[] sortedLeft, int[] sortedRight, int[]inputArray) {
        int leftIter = 0, rightIter = 0, arryIter = 0;
        while (leftIter < sortedLeft.length && rightIter < sortedRight.length) {
            if (sortedLeft[leftIter] <= sortedRight[rightIter]) {
                inputArray[arryIter++] = sortedLeft[leftIter++];
            } else {
                inputArray[arryIter++] = sortedRight[rightIter++];
            }
        }
        while (leftIter < sortedLeft.length) {
            inputArray[arryIter++] = sortedLeft[leftIter++];
        }
        while (rightIter < sortedLeft.length) {
            inputArray[arryIter++] = sortedRight[rightIter++];
        }
    }
}
