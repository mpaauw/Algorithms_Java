package Sort.ComparisonSort.ShellSort;

import java.util.ArrayList;

public class ShellSort {

    private static int[] _array;
    private static ArrayList<Integer> _gaps = new ArrayList<Integer>();

    /*
    * SUMMARY:  Takes an unsorted array and performs a Shell Sort on it.
    *           Efficiency: O(n(log(n))^2)
    * */
    public void shellSort(int[] inputArray){
        int j;
        for(int gap = inputArray.length; gap > 0; gap /= 2){
            for(int i = gap; i < inputArray.length; i++){
                int temp = inputArray[i];
                for(j = i; j >= gap && temp < inputArray[j - gap]; j -= gap){
                    inputArray[j] = inputArray[j - gap];
                }
                inputArray[j] = temp;
            }
        }
    }
}
