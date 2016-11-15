package Sort.EfficientSort.QuickSort;

public class QuickSort {

    public void quickSort(int[] inputArray){
        int low = inputArray[0];
        int high = inputArray[inputArray.length - 1];
        sort(inputArray, low, high);
    }

    private static void sort(int[] inputArray, int low, int high){
        if(low < high){
            int p = partition(inputArray, low, high);
            sort(inputArray, low, p - 1);
            sort(inputArray, p + 1, high);
        }
    }

    private static int partition(int[] inputArray, int low, int high){
        int pivot = inputArray[high];
        int i = low;
        for(int j = low; j < high - 1; j++){
            if(inputArray[j] <= pivot){
                int temp = inputArray[i];
                inputArray[i] = inputArray[j];
                inputArray[j] = temp;
                i++;
            }
        }
        int temp = inputArray[i];
        inputArray[i] = inputArray[high];
        inputArray[high] = temp;
        return i;
    }

}
