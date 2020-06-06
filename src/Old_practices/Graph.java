package Old_practices;

import java.util.*;


public class Graph{
    int v;
    HashMap<Integer,ArrayList<Integer>> hap = new HashMap<>();

    Graph(int verticles){
        v=verticles;

        for(int i=0;i<v;i++){
            hap.put(i,new ArrayList<Integer>());
        }
    }

    void addedges(int src,int destination){

           if(hap.containsKey(src)) {
            ArrayList<Integer> aa = hap.get(src);
            aa.add(destination);
        }else {
            System.out.print("verticles isn't in the tree");
        }

    }


    void routedfind(int src, int destination){

        Stack<Integer> stack = new Stack<>();
        if(hap.containsKey(src)){
            ArrayList<Integer> temp = hap.get(src);
            for(int couter=0;couter<temp.size();couter++){
                stack.push(temp.get(couter));
                if(stack.peek()==destination) {
                    System.out.print("Path is there"); // if there is a direct path
                    return;
                }
            }
            int flag =0;
            while (!stack.isEmpty()){ // else we doing depth first seach
                Integer tempa = stack.pop();

                if(hap.containsKey(tempa)){
                    ArrayList<Integer> temer = hap.get(tempa);
                    for(int couter=0;couter<temer.size();couter++){
                        if(temer.size()>0) {
                            if (destination == temer.get(couter)) {
                                System.out.print("Path is there");
                                flag=1;
                                break;
                            }
                        }
                    }

                }

            }
            if(flag==0)
            System.out.print("Path not exist");
        }
    }







    public static void main(String[] args) {

        Graph graph = new Graph(6);
        graph.addedges(0,1);
        graph.addedges(0,5);
        graph.addedges(0,4);
        graph.addedges(1,4);
        graph.addedges(1,3);
        graph.addedges(2,1);
        graph.addedges(3,2);
        graph.addedges(3,4);

        graph.routedfind(0,4);
    }
}
/*
0 1 1 1 0 0 0
        1 0 1 0 0 0 0
        1 1 0 1 1 0 0
        1 0 1 0 1 0 0
        0 0 1 1 0 1 1
        0 0 0 0 1 0 0
        0 0 0 0 1 0 0 */