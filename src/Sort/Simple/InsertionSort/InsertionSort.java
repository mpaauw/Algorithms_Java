package Sort.Simple.InsertionSort;

/*
* SUMMARY:  A class that includes code to perform an Insertion Sort.
* */
public class InsertionSort {

    /*
    * SUMMARY:  Takes an unsorted array and performs an Insertion Sort on it
    *           Efficiency: O(n^2)
    * */
    public void insertionSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int j = i;
            while ((j > 0) && (inputArray[j - 1] > inputArray[j])) {
                int temp = inputArray[j];
                inputArray[j] = inputArray[j - 1];
                inputArray[j - 1] = temp;
                j--;
            }
        }
    }
}
