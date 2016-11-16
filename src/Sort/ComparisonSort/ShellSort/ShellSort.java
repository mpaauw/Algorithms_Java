package Sort.ComparisonSort.ShellSort;

public class ShellSort {

    /*
    * SUMMARY:  Takes an unsorted array and performs a Shell Sort on it.S
    *           Efficiency: O(n(log(n))^2)
    * */
    public void shellSort(int[] inputArray){
        int n = inputArray.length;
        boolean swapped = false;
        int gap = n;
        while(!swapped){
            swapped = false;
            gap = gap / 2;
            int end = inputArray[gap];
            while(end != inputArray.length){
                int left = end - gap;
                int right = end;
                if(inputArray[left] > inputArray[right]){
                    int temp = inputArray[left];
                    inputArray[left] = inputArray[right];
                    inputArray[right] = temp;
                    swapped = true;
                }
                end++;
            }
        }
    }
}
