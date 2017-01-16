package Sort.Hybrid;

import Resources.BinarySearchTree;

import java.util.Arrays;

public class TreeSort {

    private BinarySearchTree<Integer> bst = new BinarySearchTree<>();

    public int[] treeSort(int[] inputArray){

        Integer[] nonPrimArray = Arrays.stream(inputArray).boxed().toArray(Integer[]::new);

        for(int i = 0; i < inputArray.length; i++){
            bst.insert(inputArray[i]);
        }
        inputArray = Arrays.stream(bst.traverseInOrderSortCall(nonPrimArray)).mapToInt(Integer::intValue).toArray();
        return inputArray;
    }


}

