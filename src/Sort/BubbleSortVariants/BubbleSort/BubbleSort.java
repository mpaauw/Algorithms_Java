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
//        int n = inputArray.length;
//        boolean swapped = false;
//        while(swapped){
//            swapped = false;
//            for(int i = 1; i < n - 1; i++){
//                if(inputArray[i - 1] > inputArray[i]){
//                    int temp = inputArray[i - 1];
//                    inputArray[i - 1] = inputArray[i];
//                    inputArray[i] = temp;
//                    swapped = true;
//                }
//            }
//            n = n - 1;
//        }

    }
}