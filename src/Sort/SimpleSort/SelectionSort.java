package Sort.SimpleSort;

/*
* SUMMARY:  A class that includes code to perform a Selection Sort.
* */
public class SelectionSort {

    /*
    * SUMMARY:  Takes an unsorted array and performs a Selection Sort on it
    *           Efficiency: O(n^2)
    * */
    public static void selectionSort(int[] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            int minIndex = i;
            for(int j = i + 1; j < inputArray.length; j++){
                if(inputArray[j] < inputArray[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                int temp = inputArray[i];
                inputArray[i] = inputArray[minIndex];
                inputArray[minIndex] = temp;
            }
        }
    }
}
