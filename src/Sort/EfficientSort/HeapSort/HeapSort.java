package Sort.EfficientSort.HeapSort;

import java.util.PriorityQueue;

public class HeapSort {
    /*
    * SUMMARY:  Takes an unsorted array and performs a Heap Sort on it.
    *           This algorithm utilizes a min heap in order to sort the input into
    *               ascending order through the following steps:
    *                   1. Build heap
    *                   2. Transform the heap into a Min Heap
    *                   3. Delete the root node
    *                   4. Put the last node of the heap in the root position of the heap
    *                   5. Repeat from step 2 until all nodes have been sorted
    * */

    private static PriorityQueue<Integer> _heap = new PriorityQueue<Integer>();

    public static void heapSort(int[] inputArray){
        heapify(inputArray);
        inputArray = siftDown(inputArray.length);
    }

    private static void heapify(int[] inputArray){
        for(Integer item : inputArray){
            _heap.add(item);
        }
    }

    private static int[] siftDown(int arrayLength){
        int[] sortedArray = new int[arrayLength];
        for(int i = 0; i < sortedArray.length; i++){
            sortedArray[i] = _heap.remove();
        }
        return sortedArray;
    }
}
