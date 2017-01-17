package Sort.Other;

import Resources.Graph;
import Resources.GraphNode;
import Resources.Stack;

import java.util.ArrayList;
import java.util.HashMap;

public class TopologicalSort {

    private Stack<GraphNode<Character>> _stack = new Stack();

    public Character[] topologicalSort(Graph<Character> inputGraph){
        if(sort(inputGraph.getVertices())){
            return processStack();
        }
        return null;
    }

    private boolean sort(HashMap<Character, GraphNode<Character>> nodes){
        for(GraphNode<Character> node : nodes.values()){
            if(node.getVisitState() == Graph.VisitState.Unvisited){
                if(!recurseDFS(node)){
                    return false; // loop encountered
                }
            }
        }
        return true;
    }

    private boolean recurseDFS(GraphNode<Character> node){
        if(node.getVisitState() == Graph.VisitState.Visiting){
            return false; // loop encountered
        }
        if(node.getVisitState() == Graph.VisitState.Unvisited){
            node.setVisitState(Graph.VisitState.Visiting);
            ArrayList<GraphNode<Character>> children = node.getChildren();
            for(GraphNode<Character> child : children){
                if(!recurseDFS(child)){
                    return false;
                }
            }
            node.setVisitState(Graph.VisitState.Visited);
            _stack.push(node);
        }
        return true;
    }

    private Character[] processStack(){
        Character[] finalOrdering = new Character[_stack.getSize()];
        int i = 0;
        while(!_stack.isEmpty()){
            GraphNode<Character> node = _stack.pop();
            finalOrdering[i] = node.getData();
            i++;
        }
        return finalOrdering;
    }
}
