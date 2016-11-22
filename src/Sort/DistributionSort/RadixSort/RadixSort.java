package Sort.DistributionSort.RadixSort;

import java.util.ArrayList;

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
            ArrayList<Integer>[] buckets = new ArrayList[10];
            for(int x = 0; x < buckets.length; x++){
                buckets[x] = new ArrayList();
            }
            for(int j = 0; j < inputArray.length; j++){
                int modResult = inputArray[j] % mod;
                int divResult = modResult / div;
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
