package Sort.ComparisonSort.CombSort;

public class CombSort {

    public void combSort(int[] inputArray){
        double gap = inputArray.length;
        double shrinkFactor = 1.3;
        boolean sorted = false;
        while(!sorted){
            gap = Math.floor(gap / shrinkFactor);
            if(gap > 1){
                sorted = false;
            }
            else{
                gap = 1;
                sorted = true;
            }
            int i = 0;
            while(i + gap < inputArray.length){
                if(inputArray[i] > inputArray[i + (int)gap]){
                    int temp = inputArray[i];
                    inputArray[i] = inputArray[i + (int)gap];
                    inputArray[i + (int)gap] = inputArray[i];
                }
                i++;
            }
        }
    }
}
