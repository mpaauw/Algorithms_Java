package Sort.Other;

import Resources.Graph;
import Resources.GraphNode;
import Resources.Stack;

import java.util.ArrayList;
import java.util.HashMap;

public class TopologicalSort {

    private Stack<GraphNode<Integer>> _stack = new Stack();

    public int[] topologicalSort(Graph<Integer> inputGraph){
        if(sort(inputGraph.getVertices())){
            return processStack();
        }
        return null;
    }

    private boolean sort(HashMap<Integer, GraphNode<Integer>> nodes){
        for(GraphNode<Integer> node : nodes.values()){
            if(node.getVisitState() == Graph.VisitState.Unvisited){
                if(!recurseDFS(node)){
                    return false; // loop encountered
                }
            }
        }
        return true;
    }

    private boolean recurseDFS(GraphNode<Integer> node){
        if(node.getVisitState() == Graph.VisitState.Visiting){
            return false; // loop encountered
        }
        if(node.getVisitState() == Graph.VisitState.Unvisited){
            node.setVisitState(Graph.VisitState.Visiting);
            ArrayList<GraphNode<Integer>> children = node.getChildren();
            for(GraphNode<Integer> child : children){
                if(!recurseDFS(child)){
                    return false;
                }
            }
            node.setVisitState(Graph.VisitState.Visited);
            _stack.push(node);
        }
        return true;
    }

    private int[] processStack(){
        int[] finalOrdering = new int[_stack.getSize()];
        int i = 0;
        while(!_stack.isEmpty()){
            GraphNode<Integer> node = _stack.pop();
            finalOrdering[i] = node.getData();
            i++;
        }
        return finalOrdering;
    }
}
