import java.util.*;
import java.util.Queue;

public class binaryTree{
    int data;
    binaryTree leftchild,rightchild,root=null;

    binaryTree(int data){
        this.data=data;
        leftchild=rightchild=null;
    }

    binaryTree() {};

    void create(){
        Scanner s = new Scanner(System.in);
        Queue<binaryTree> q = new LinkedList<>();
        if(root==null){
            System.out.println("Enter root's value");
            binaryTree b = new binaryTree(s.nextInt());
            root=b;
            q.add(root);
        }
        while (!q.isEmpty()){
            binaryTree temp = q.remove();
            System.out.println("Enter value for left child of "+ temp.data);
            int value = s.nextInt();
            if(value!=-1){
                binaryTree newnode = new binaryTree(value);
                temp.leftchild=newnode;
                q.add(temp.leftchild);
            }
            System.out.println("Enter value for right child of "+ temp.data);
            int value1 = s.nextInt();
            if(value1!=-1){
                binaryTree newnode1 = new binaryTree(value1);
                temp.rightchild=newnode1;
                q.add(temp.rightchild);
            }

        }

    }


    private void inorder(binaryTree root) {
        if(root!=null){
            inorder(root.leftchild);
            System.out.println(root.data);
            inorder(root.rightchild);
        }
    }

    void insert(int i){
        root=createBinaryTreeRecursive(root,i);
    }

    binaryTree createBinaryTreeRecursive(binaryTree root,int i){
        binaryTree node = new binaryTree(i);
        if(root==null)
            return node;

        if(i<root.data)
            root.leftchild=createBinaryTreeRecursive(root.leftchild,i);
        else
            root.rightchild=createBinaryTreeRecursive(root.rightchild,i);
        return root;
    }

    private binaryTree createBinaryTreeiterative(binaryTree root, int i) {
        binaryTree node = new binaryTree(i);
        if(root==null)
            return node;

        binaryTree parent = null, current=root;
        while (current!=null){
            parent=current;
            if(i<current.data)
                current=current.leftchild;
            else if(i>current.data)
                current=current.rightchild;

        }

        if(i<parent.data)
            parent.leftchild=node;
        else
            parent.rightchild=node;

        return root;
    }

    binaryTree search(binaryTree root,int i){
        if(root==null){
            return null;
        }

        if(i==root.data){
            System.out.println("key found");
        }

        if(i<root.data){
            root.leftchild=search(root.leftchild,i);
        }else {
            root.rightchild=search(root.rightchild,i);
        }
        return root;
    }

    void search(int i){
        binaryTree current = root;
        int flag=0;
        while (current!=null){
            if(current.data==i) {
                System.out.println("Key fond");
                flag=1;
            }
            if(i<current.data)
                current=current.leftchild;
            else
                current=current.rightchild;
        }
        if(flag==0){
            System.out.println("key not found");
        }
    }

    int count(binaryTree root){
        if(root==null){
            return 0;
        }
        int leftsize = count(root.leftchild);
        int rightsize = count(root.rightchild);
        return leftsize+rightsize+1;
    }

    int height(binaryTree root){
        if(root==null)
            return 0;

        int leftsize = height(root.leftchild);
        int rightsize = height(root.rightchild);

        return leftsize>rightsize? leftsize+1:rightsize+1;

    }

    boolean sumtoleaf(binaryTree root, int sum, List<Integer> result){
        if(root==null)
            return false;
        if(root.leftchild==null && root.rightchild==null){
            if(sum==root.data){
                result.add(root.data);
                return true;
            }else{
                return false;
            }
        }

        if(sumtoleaf(root.leftchild,sum-root.data,result)){
            result.add(root.data);
            return true;
        }

        if(sumtoleaf(root.rightchild,sum-root.data,result)){
            result.add(root.data);
            return true;
        }



        return false;
    }

    boolean checkifisitabinarytree(binaryTree root,int min,int max){
        if(root==null){
            return true;
        }

        if(root.data <= min || root.data >max){
            return false;
        }

        return checkifisitabinarytree(root.leftchild,min,root.data) && checkifisitabinarytree(root.rightchild,root.data,max);
    }

    void levelorder(binaryTree root){
        Queue<binaryTree> q = new LinkedList();
        if(root==null)
            return;
        else
            q.add(root);

        while (!q.isEmpty()){
            binaryTree temp = q.remove();
            if(temp.leftchild!=null)
                q.add(temp.leftchild);

            if(temp.rightchild!=null) {

                q.add(temp.rightchild);
            }
            System.out.println(temp.data);

        }
    }


    void postorderiterative(binaryTree root){
        Stack<binaryTree> s = new Stack<>();
        Stack<binaryTree> s2 = new Stack<>();

        if(root==null){
            return;
        }

        s.push(root);
        while (!s.empty()){
            binaryTree temp = s.pop();
            s2.push(temp);

            if(temp.leftchild!=null)
                s.push(temp.leftchild);
            if(temp.rightchild!=null)
                s.push(temp.rightchild);

            }

        while (!s2.empty()){
            System.out.println(s2.pop().data);
        }


        }


        void preorderiterative(binaryTree root){
        if(root==null){
            return;
        }
        Stack<binaryTree> s = new Stack<>();
        s.push(root);
        while (!s.empty()){
            root=s.pop();
            System.out.println(root.data);

            if(root.rightchild!=null){
                s.push(root.rightchild);
            }
            if(root.leftchild!=null){
                s.push(root.leftchild);
            }
        }

        }

        void levelorderreverse(binaryTree root){
            if(root==null){
                return;
            }
            Queue<binaryTree> q = new LinkedList<>();
            Stack<binaryTree> s = new Stack<>();
            q.add(root);

            while (!q.isEmpty()){
                binaryTree currrent = q.remove();

                if(currrent.rightchild!=null){
                    q.add(currrent.rightchild);
                }
                if(currrent.leftchild!=null)
                    q.add(currrent.leftchild);

                s.push(currrent);
            }

            while (!s.empty()){
                System.out.println(s.pop().data);
            }
        }

    public static void main(String[] args) {
        binaryTree bt = new binaryTree();

    /*    Scanner s = new Scanner(System.in);
        int numberofnodes = s.nextInt();

        while (numberofnodes-->0){
            bt.insert(s.nextInt());
        }
*/

        bt.create();

       // bt.inorder(bt.root);

       //bt.search(10);

      /* bt.minimum(bt.root);
     /*  bt.maximum(bt.root);*/ 

   //    bt.deleterc(50);

     /*   int x =bt.height(bt.root);
        System.out.println(x);*/

        /*bt.search(50);
        bt.inorder(bt.root);

        System.out.println(bt.count(bt.root));

        System.out.println(bt.height(bt.root));

        List<Integer> result = new LinkedList<>();

        bt.sumtoleaf(bt.root,180,result);

      /*  for(int i:result){
            System.out.println(i);
        }

        System.out.println(bt.checkifisitabinarytree(bt.root,Integer.MIN_VALUE,Integer.MAX_VALUE));*/

    //    bt.levelorder(bt.root);

     //   bt.postorderiterative(bt.root);

        bt.levelorderreverse(bt.root);
    }



}

//            System.out.println(t.data);




