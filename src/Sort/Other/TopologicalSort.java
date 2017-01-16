package Sort.Other;

import Resources.BinarySearchTree;

import java.util.Stack;

public class TopologicalSort {

    private Stack<Integer> _stack = new Stack();
    private BinarySearchTree<Integer> _bst = new BinarySearchTree<>();

    public void topologicalSort(int[] inputArray){
        createTree(inputArray);
    }

    private void createTree(int[] array){
        for(Integer item : array){
            _bst.insert(item);
        }
    }
}
