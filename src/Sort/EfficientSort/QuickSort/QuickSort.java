package Sort.EfficientSort.QuickSort;

public class QuickSort {

    private static int[] _array;

    public void quickSort(int[] inputArray) {
        _array = inputArray;
        int leftIndex = 0;
        int rightIndex = inputArray.length - 1;
        sort(leftIndex, rightIndex);
    }

    private static void sort(int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex <= 0) {
            return;
        }
        int pivot = _array[rightIndex];
        int pivotSpot = partition(pivot, leftIndex, rightIndex);
        sort(leftIndex, pivotSpot - 1);
        sort(pivotSpot + 1, rightIndex);
    }

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

    private static void swap(int i, int j) {
        int temp = _array[i];
        _array[i] = _array[j];
        _array[j] = temp;
    }
}
