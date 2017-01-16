package Sort.Efficient.HeapSort;

import java.util.PriorityQueue;

public class HeapSort {

    private static PriorityQueue<Integer> _heap = new PriorityQueue<Integer>();

    /*
    * SUMMARY:  Takes an unsorted array and performs a Heap Sort on it.
    *           Efficiency: O(n log(n))
    * */
    public void heapSort(int[] inputArray){
        heapify(inputArray);
        siftDown(inputArray);
    }

    /*
    * SUMMARY:  To be used with the heapSort function; creates a Heap object (represented by a Priority Queue in Java)
    *               from unsorted array elements.
    * */
    private static void heapify(int[] inputArray){
        for(Integer item : inputArray){
            _heap.add(item);
        }
    }

    /*
    * SUMMARY:  To be used with the heapSort function; pops off values from the Heap object in a sorted order.
    * */
    private static void siftDown(int[] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = _heap.remove();
        }
    }
}