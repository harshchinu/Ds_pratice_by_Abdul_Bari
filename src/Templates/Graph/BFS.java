package Templates.Graph;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Graph<Character> graph = new Graph<>();
        graph.addEdge('a', 'b', false);
        graph.addEdge('a', 'c', false);
        graph.addEdge('b', 'd', false);
        graph.addEdge('b', 'g', false);
        graph.addEdge('c', 'e', false);
        graph.addEdge('d','f',false);
        graph.addEdge('e','f',false);
        graph.addEdge('f','g',false);


        //  graph.addVerticles('e,');
       // System.out.print(graph.toString());

        //bfs(graph,'a');
        dfs(graph,'a');
    }

    private static void dfs(Graph<Character> graph, char a) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Boolean> visted = new HashMap<>();
        for(Character c:graph.map.keySet()){
            visted.put(c,false);
        }


        stack.push(a);

        while (!stack.isEmpty()){
            Character character = stack.pop();
            if(visted.get(character)==false){
                visted.put(character,true);
                System.out.println(character);
                List l = graph.map.get(character);
                for(int i=0;i<l.size();i++){
                    Edge edge = (Edge) l.get(i);
                    if(visted.get(edge.getDestination())==false) {
                        stack.push((Character) edge.getDestination());
                    }
                }
            }
        }




    }

    private static void bfs(Graph<Character> graph,Character a){
        Queue<Character> queue = new LinkedList<>();
        HashMap<Character,Boolean> visted = new HashMap<>();
        for(Character c:graph.map.keySet()){
            visted.put(c,false);
        }

            queue.add(a);

        while (!queue.isEmpty()){
            Character character = queue.remove();
            if(visted.get(character)==false){
                visted.put(character,true);
                System.out.println(character);
                List l = graph.map.get(character);
              for(int i=0;i<l.size();i++){
                    Edge edge = (Edge) l.get(i);
                   if(visted.get(edge.getDestination())==false) {
                       queue.add((Character) edge.getDestination());
                   }
                }
            }
        }


    }


}
