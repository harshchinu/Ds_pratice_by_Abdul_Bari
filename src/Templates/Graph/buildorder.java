package Templates.Graph;

import Templates.Graph.Graph;

import java.awt.image.ImageProducer;
import java.util.*;

class buildorder {
        public static void main(String[] args) {
            Graph<Character> graph = new Graph<>();
            graph.addEdge('a', 'c', false);
            graph.addEdge('b', 'c', false);
            graph.addEdge('b', 'd', false);
            graph.addEdge('c', 'e', false);
            graph.addEdge('d', 'f', false);

            graph.addEdge('e', 'h', false);
            graph.addEdge('e', 'f', false);
            graph.addEdge('f', 'g', false);
           // graph.addVerticles('e');

           // System.out.print(graph.toString());
          /*  StringBuffer result = new StringBuffer();
            for(Character c: graph.map.keySet()){
                //for(Edge i : graph.map.get(c)){
                List l = graph.map.get(c);
                result.append(c);
                   for(int i=0;i<l.size();i++) {
                       Edge e = (Edge) l.get(i);
                       result.append(" ----> " + e.getDestination() + " " + e.weight+",");

                   }
                result.append("\n");
                }*/


         //   System.out.print(graph.toString());

            Topologicalsort(graph);

        }

    private static void Topologicalsort(Graph<Character> graph) {
            Stack<Character> stack = new Stack<>();
            HashMap<Character,Boolean> hap= new HashMap<>();
            ArrayList<Character> temper = new ArrayList<>();
            for(Character c:graph.map.keySet()){
                hap.put(c,false);
            }

            for(Character c:graph.map.keySet()){
                if(hap.get(c)==false) {
                    stack.push(c);
                    hap.put(c,true);
                    topologicalsortUtil(graph, c, stack, hap);

                }
                while (!stack.empty()){
                   // System.out.print(stack.pop());
                    temper.add(stack.pop());
                }
            }
            
         Collections.reverse(temper);
            for (Character c:temper) {
                System.out.print(c);
            
        }




    }

    private static void topologicalsortUtil(Graph<Character> graph, Character c, Stack<Character> stack, HashMap<Character, Boolean> hap) {

            List list = graph.map.get(c);


                for(int i=0;i<list.size();i++){
                    Edge temp = (Edge) list.get(i);
                    if(hap.get(temp.getDestination())==false) {
                        stack.push((Character) temp.getDestination());
                        hap.put((Character) temp.getDestination(),true);
                        topologicalsortUtil(graph, (Character) temp.getDestination(), stack, hap);
                    }
                }
            }
    }



