package Sort.Efficient.QuickSort;

/*
* SUMMARY:  A class that includes code to perform a Quick Sort.
* */
public class QuickSort {

    private static int[] _array;

    /*
    * SUMMARY:  Takes an unsorted array and performs a Quick Sort on it.
    *           Efficiency: O(n log(n))
    * */
    public void quickSort(int[] inputArray) {
        _array = inputArray;
        int leftIndex = 0;
        int rightIndex = inputArray.length - 1;
        sort(leftIndex, rightIndex);
    }

    /*
    * SUMMARY:  To be used with the quickSort function; used to recursively sort array partitions.
    * */
    private static void sort(int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) {
            return;
        }
        int pivot = _array[rightIndex];
        int pivotSpot = partition(pivot, leftIndex, rightIndex);
        sort(leftIndex, pivotSpot - 1);
        sort(pivotSpot + 1, rightIndex);
    }

    /*
    * SUMMARY:  To be used with the sort function; used to create partitions within an array.
    * */
    private static int partition(int pivot, int left, int right) {
        int l = left - 1;
        int r = right;
        while (true) {
            while (_array[++l] < pivot) ;
            while (r > 0 && _array[--r] > pivot) ;
            if (l >= r) {
                break;
            }
            swap(l, r);
        }
        swap(l, right);
        return l;
    }

    /*
    * SUMMARY:  To be used with the partition function; used to swap two elements in-place.
    * */
    private static void swap(int i, int j) {
        int temp = _array[i];
        _array[i] = _array[j];
        _array[j] = temp;
    }
}
