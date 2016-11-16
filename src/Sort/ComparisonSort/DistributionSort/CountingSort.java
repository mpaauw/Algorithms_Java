package Sort.ComparisonSort.DistributionSort;

public class CountingSort {

    public void countingSort(int[] inputArray){
        int[] indexArray = new int[inputArray.length + 1], returnArray = new int[inputArray.length];
        for(Integer item : inputArray){ // add unsorted items to index array
            indexArray[item]++;
        }
        for(int i = 1; i < indexArray.length; i++){ // count totals in index array
            int total = indexArray[i] + indexArray[i - 1];
            indexArray[i] = total;
        }
        for(int i = inputArray.length - 1; i >= 0; i--){
            int sortValue = inputArray[i];
            int indexValue = indexArray[sortValue] - 1;
            returnArray[indexValue] = sortValue;
        }
        inputArray = returnArray;
    }
}
