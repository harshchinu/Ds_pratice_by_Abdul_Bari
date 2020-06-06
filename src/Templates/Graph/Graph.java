package Templates.Graph;

import java.util.*;

public class Graph<T> {

   // ArrayList<Edge<T>> allEdges = new ArrayList<>();

    Map<T,ArrayList<Edge<T>>> map = new HashMap<>();


    public void addVerticles(T vertex){
        if(!map.containsKey(vertex)){
            map.put(vertex,new ArrayList<>());
        }
    }

    public void addEdge(T source, T destination, boolean bidireaction) {
        addEdge(source,destination,bidireaction,0);
    }

    public void addEdge(T source, T destination, boolean bidireaction,int weight){
        if(!map.containsKey(source))
            addVerticles(source);

        if(!map.containsKey(destination))
            addVerticles(destination);

        map.get(source).add(new Edge<>(source,destination,weight));
        if(bidireaction==true)
            map.get(destination).add(new Edge<>(source,destination,weight));
    }

    public void getVertexCount(){
        System.out.print("The Graph has"+map.keySet().size()+" vertex");
    }

    public void getEdgecount(boolean bidirectional) {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.keySet().size();
        }
        if (bidirectional == true)
            count /= 2;

        System.out.print("The graph has +"+count+" edges.");

    }

    public void hasVertex(T s){
        if(map.containsKey(s))
            System.out.print("The graph has"+ s+" Vertex");
        else
            System.out.print("The graph does not have "+ s+" vertex");
    }

    public void hasEdge(T source, T destination){
        if(map.get(source).contains(destination))
            System.out.print("Has edge");
        else
            System.out.print("doesn't");
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        for(T c: map.keySet()){
            //for(Edge i : graph.map.get(c)){
            List l = map.get(c);
            result.append(c);
            for(int i=0;i<l.size();i++) {
                Edge e = (Edge) l.get(i);
                result.append(" ----> " + e.getDestination() + " " + e.weight+",");

            }
            result.append("\n");
        }
        return result.toString();
    }
}

class Edge<T>{
    int weight;
    T source;
    T destination;

    public int getWeight() {
        return weight;
    }

    public T getSource() {
        return source;
    }

    public T getDestination() {
        return destination;
    }

    boolean directed;

    Edge(T source,T destination){
        this.source=source;
        this.destination=destination;
        weight=0;
    }

    Edge(T source,T destination,int weight){
        this.source=source;
        this.destination=destination;
        this.weight=weight;
    }
}