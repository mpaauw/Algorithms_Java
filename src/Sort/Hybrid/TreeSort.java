package Sort.Hybrid;

public class TreeSort {

    private BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

    public void treeSort(int[] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            bst.insert(inputArray[i]);
        }
        inputArray =  bst.traverseInOrderCallSort().stream().mapToInt(i -> i).toArray();
    }
}
