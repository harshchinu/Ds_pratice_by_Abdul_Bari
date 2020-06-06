package Templates.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node<T>{
    T data;
   public Node left,right;

  public  Node(T data){
        this.data=data;
        left=right=null;
    }
}

public class binaryTrees<T> {
    public Node root;
    Queue<Node> q = new LinkedList<Node>();
    public binaryTrees(T data){
        root = new Node<T>(data);
    }

    public binaryTrees(){
        root = null;
    }


   public void insert(){
        root=insert(root);
    }
    public Node insert(Node root){
        Scanner s = new Scanner(System.in);
        if(root==null) {
            System.out.println("Enter root values");
            root= new Node(s.nextInt());
            q.add(root);
        }

        while (!q.isEmpty()) {
            Node temp = q.remove();
            System.out.println("Enter left child of "+temp.data);
            int sa = s.nextInt();
            if (sa!=-1){
                temp.left=new Node(sa);
                q.add(temp.left);
            }
            System.out.println("Enter rigth child of "+temp.data);
            int sa1 = s.nextInt();

            if(sa1!=-1) {
                temp.right = new Node(sa1);
                q.add(temp.right);
            }
        }
        return root;
    }



    public void printInorder(Node root){
        if(root!=null){
            System.out.println(root.data);
            printInorder(root.left);

            printInorder(root.right);

        }
    }

    Node commonAncestor(Node root,T i, T j){

        if(root==null)
            return null;

        if(root.data==i || root.data==j)
            return root;

         Node left =  commonAncestor(root.left,i,j);
         Node right=  commonAncestor(root.right,i,j);
         //  same(root,i,j);

        if(left!=null && right!=null)
            return root;

        if(left==null && right==null)
            return null;

        return left!=null?left:right;
    }

    boolean same(Node root, T i, T j){
        if(root.data == i || root.data == j){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        binaryTrees<Integer> binaryTrees = new binaryTrees<Integer>();
        binaryTrees.insert();
      //  binaryTrees.printInorder(binaryTrees.root);


       binaryTrees.commonAncestor(binaryTrees.root,7,17);

       System.out.print(binaryTrees.commonAncestor(binaryTrees.root,7,17).data);

    }


}/*
20
10
30
5
15
-1
-1
3
7
-1
15
17
-1
-1
-1
-1
-1
-1*/