package Sort.DistributionSort;

public class CountingSort {

    /*
    * SUMMARY:  Takes an unsorted array and performs a Counting Sort on it.
    *           Efficiency: O(n + k)
    * */
    public void countingSort(int[] inputArray){
        int max = 0, min = 0;
        int[] tempArray = inputArray;
        for(Integer item : tempArray){
            if(item > max){
                max = item;
            }
            if(item <= min){
                min = item;
            }
        }
        int[] indexArray = new int[(max - min) + 1];
        for(Integer item : tempArray){ // add unsorted items to index array
            //indexArray[item]++;
            indexArray[item - min]++;
        }
//        for(int i = 1; i < indexArray.length; i++){ // count totals in index array
//            int total = indexArray[i] + indexArray[i - 1];
//            indexArray[i] = total;
//        }
        int indexToInsert = 0, currentIndex = 0, finishIndex = indexArray.length;

        while(currentIndex != finishIndex){
            int instanceCount = indexArray[currentIndex];
            for(int j = 0; j < instanceCount; j++){
                inputArray[indexToInsert++] = currentIndex + min;
            }
            currentIndex++;
        }
    }
}
