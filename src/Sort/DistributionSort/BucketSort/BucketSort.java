package Sort.DistributionSort.BucketSort;

public class BucketSort {

    /*
    * SUMMARY:  Takes an unsorted array and performs a Bucket Sort on it.
    *           Efficiency: O(n + k)
    * */
    public void bucketSort(int[] inputArray){
        int max = 0, min = 0;
        for(Integer item : inputArray){
            if(item > max){
                max = item;
            }
            if(item <= min){
                min = item;
            }
        }
        int[] buckets = new int[max + 1];
        for(int i = 0; i < buckets.length; i++){
            buckets[i] = 0;
        }
        for(int i = 0; i < inputArray.length; i++){
            buckets[inputArray[i]]++;
        }
        int reinsertIter = 0;
        for(int i = 0; i < buckets.length; i++){
            for(int j = 0; j < buckets[i]; j++){
                inputArray[reinsertIter++] = i;
            }
        }
    }
}
