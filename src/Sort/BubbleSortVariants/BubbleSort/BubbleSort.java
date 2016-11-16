package Sort.BubbleSortVariants.BubbleSort;

public class BubbleSort {
    public void bubbleSort(int[] inputArray){
        int n = inputArray.length;
        while(n != 0){
            int swapIter = 0;
            for(int i = 1; i < n; i++){
                if(inputArray[i - 1] > inputArray[i]){
                    int temp = inputArray[i - 1];
                    inputArray[i - 1] = inputArray[i];
                    inputArray[i] = temp;
                    swapIter = i;
                }
            }
            n = swapIter;
        }
    }
}