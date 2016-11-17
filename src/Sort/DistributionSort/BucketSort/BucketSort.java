package Sort.DistributionSort.BucketSort;

import Sort.SimpleSort.InsertionSort.InsertionSort;

import java.util.ArrayList;
import java.util.Arrays;

public class BucketSort {

    private InsertionSort _insertionSort = new InsertionSort();

    /*
    * SUMMARY:  Takes an unsorted array and performs a Bucket Sort on it.
    *           Efficiency: O(n + k)
    * */
    public void bucketSort(int[] inputArray){
        int max = 0, min = 0;
        getMaxMin(max, min, inputArray);
        int numBuckets = (int)Math.sqrt(inputArray.length);
        ArrayList<Integer>[] buckets = new ArrayList[numBuckets];
        int divisor = (int)Math.ceil((max + 1) / numBuckets);
        for(Integer item : inputArray){
            int j = (int)Math.floor(item / divisor);
            buckets[j].add(item);
        }

        for(int i = 0; i < buckets.length; i++){
            int[] bucketArray = Arrays.stream(buckets[i].toArray(new Integer[buckets[i].size()])).mapToInt(Integer::intValue).toArray();
            _insertionSort.insertionSort(bucketArray);
        }

        int reinsertIter = 0;
        for(int i = 0; i < buckets.length; i++){
            for(Integer sortedItem : buckets[i]){
                inputArray[reinsertIter] = sortedItem;
                reinsertIter++;
            }
        }
    }

    private static void getMaxMin(int max, int min, int[] inputArray){
        for(Integer item : inputArray){
            if(item > max){
                max = item;
            }
            if(item <= min){
                min = item;
            }
        }
    }
}
