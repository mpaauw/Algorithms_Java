package Sort.Other;

import Resources.Graph;
import Resources.GraphNode;
import org.junit.Test;

public class TopologicalSort_Test {

    private TopologicalSort _topologicalSort;
    private Graph<Character> _graph = new Graph();
    private Character[] _vertices = {'a','b','c','d','e','f','g','h','i','j'};
    private Character[] _properSortOrder = {'h','i','g','j','a','b','d','e','f','c'};
    private Character[][] _edges = {{'a','b'},{'b','c'},{'a','c'},{'d','e'},{'b','d'},{'e','f'},{'a','f'},{'h','i'},{'h','j'},{'i','j'},{'g','j'}};

    @Test
    public void testTopologicalSort() throws Exception{
        _topologicalSort = new TopologicalSort();
        populateGraph();
        Character[] sortedGraphOrder = _topologicalSort.topologicalSort(_graph);
        assert(sortedGraphOrder.length == _properSortOrder.length);
        for(int i = 0; i < sortedGraphOrder.length; i++){
            assert(sortedGraphOrder[i].equals(_properSortOrder[i]));
        }
    }

    private void populateGraph(){
        for(Character vertex : _vertices){
            _graph.addVertex(vertex);
        }
        for(Character[] edge : _edges){
            _graph.addEdge(edge[0], edge[1]);
        }
    }

}
