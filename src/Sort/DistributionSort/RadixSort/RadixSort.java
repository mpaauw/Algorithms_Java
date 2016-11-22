package Sort.DistributionSort.RadixSort;

import java.util.List;

public class RadixSort {

    public void radixSort(int[] inputArray){
        int max = 0;
        for(int i = 0; i < inputArray.length; i++){
            if(inputArray[i] > max){
                max = inputArray[i];
            }
        }
        int passes = Integer.toString(max).length();
        int mod = 10, div = 1;
        for(int i = 0; i < passes; i++, mod *= 10, div *= 10){
            List<Integer>[] buckets = new List[10];
            for(int j = 0; j < inputArray.length; j++){
                int modResult = inputArray[j] % mod;
                int divResult = mod / div;
                buckets[divResult].add(inputArray[j]);
            }
            int placementCounter = 0;
            for(int k = 0; k < buckets.length; k++){
                for(Integer item : buckets[k]){
                    inputArray[placementCounter++] = item;
                }
            }
        }
    }
}
