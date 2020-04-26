import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    BinarySearchTree root, left, right;
    int data;

    BinarySearchTree(int data) {
        this.data = data;
        left = right = null;
    }

    BinarySearchTree() {};


    BinarySearchTree insert(BinarySearchTree root,int value) {
        BinarySearchTree newnode = new BinarySearchTree(value);

        if (root == null) {
            return newnode;
        }

        if (value < root.data)
            root.left = insert(root.left,value);
        else if(value > root.data)
            root.right = insert(root.right,value);

        return root;
    }


    void preorder(BinarySearchTree root) {

//        System.out.println(root.data);
        if (root != null){

            System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    }

    void levelorder(BinarySearchTree root){
        Queue<BinarySearchTree> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            BinarySearchTree temp = q.remove();

            if(temp.left!=null){
                System.out.println(temp.left.data);
                q.add(temp.left);
            }

            if(temp.right!=null){
                System.out.println(temp.right.data);
                q.add(temp.right);
            }

        }
    }

    void inorder(BinarySearchTree root){
        if (root!=null){

            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    void create(BinarySearchTree root){

        System.out.println("Enter the size of binary tree");
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-->0){
            BinarySearchTree newnode = new BinarySearchTree(s.nextInt());
            if(root==null){
                root=newnode;
            }
            if(root.data < newnode.data){
                root.left=newnode;
            }
            else
                root.right=newnode;

            t--;
        }
        if(root==null){

        }
    }

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        BinarySearchTree root;
        bt.root=bt.insert(bt.root,30);
        bt.root=bt.insert(bt.root,20);
        bt.root=bt.insert(bt.root,40);
        bt.root=bt.insert(bt.root,10);
        bt.root=bt.insert(bt.root,25);

        bt.inorder(bt.root);



    }
}
