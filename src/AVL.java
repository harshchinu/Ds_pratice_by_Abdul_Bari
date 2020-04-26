import java.util.*;

class AVL{
    int data,height;
    AVL left,right,root;

    AVL(int data){
        this.data=data;
        left=right=null;
    }

    AVL(){};
    private int setHeight(AVL root) {
        if(root==null)
            return 0;

        int x = setHeight(root.left);
        int y = setHeight(root.right);
        return x>y?x+1:y+1;
    }

    int BalanceFactor(AVL left,AVL right){
        if(root==null)
            return 0;
        return height(left)-height(right);
    }

    void insert(int data){
         root=insert(root,data);
        root.height=setHeight(root);
    }

    AVL insert(AVL root,int data){
        if(root==null){
            AVL newnode = new AVL(data);
            return newnode;
        }

        if(data<root.data) {
            root.left = insert(root.left, data);
            root.left.height=setHeight(root.left);
        }
        else{
            root.right = insert(root.right, data);
            root.right.height=setHeight(root.right);
        }

        int balance = BalanceFactor(root.left,root.right);

        if(balance >1){
            if(height(root.left.left) >= height(root.left.right))
                root=leftrotation(root);
            else{
                root.left=righrotation(root.left);
                root=leftrotation(root);
            }
        }
        else if(balance<-1) {
            if (height(root.right.right) >= height(root.right.left)) {
                root = righrotation(root);
            } else {
                root.right = leftrotation(root.right);
                root = righrotation(root);
            }
        }
        else {
       //     root.height = setHeight(root);
        }

    /*   if(balance==2){
            if(BalanceFactor(root.left,root.left)==1)
                root=leftrotation(root);
            else if(BalanceFactor(root.left,root.right)==-1){
                root.left = righrotation(root.left);
                root = leftrotation(root);
            }
        }else if(balance==-2){
            if(BalanceFactor(root.left,root.right)==-1)
                root=righrotation(root);
            else if(BalanceFactor(root.left,root.right)==1){
                root.right=leftrotation(root.right);
                root=righrotation(root);
            }
        }*/

        return root;
    }
    private AVL righrotation(AVL root) {
        AVL newroot = root.right;
        root.right  = newroot.left;
        newroot.left=root;

        newroot.height=setHeight(newroot);
        root.height=root.setHeight(root);

        return newroot;

    }

    private AVL leftrotation(AVL root) {
        AVL newroot = root.left;
        root.left=newroot.right;
        newroot.right=root;
        newroot.height=setHeight(newroot);
        root.height=root.setHeight(root);

        return newroot;
    }

    void Inorder(AVL root){
        if(root!=null){
            Inorder(root.left);
            System.out.println(root.data);
            Inorder(root.right);
        }
    }

    int height(AVL root){
        if(root == null){
            return 0;
        }else {
            return root.height;
        }
    }


    void Delete(int key){
        root=delete(root,key);
    }


    private AVL delete(AVL root, int key) {

        if (root == null)
            return root;

        if (key < root.data) {
            root.left = delete(root.left, key);
            return root;
        } else if (key > root.data) {
            root.right = delete(root.right, key);
            return root;
        } else if (root.left == null) {
            AVL temp = root.right;
            root = null;
            return temp;
        } else if (root.right == null) {
            AVL temp = root.left;
            root = null;
            return temp;
        } else {
            AVL sucessornode = root;
            AVL succ = root.right;
            while (succ != null) {
                sucessornode = succ;
                succ = succ.left;
            }

            if (sucessornode != root)
                sucessornode.left = succ.right;
            else
                sucessornode.right = succ.right;

            root.data = succ.data;

            succ = null;


            int balance = BalanceFactor(root.left, root.right);

            if (balance > 1) {
                if (height(root.left.left) >= height(root.left.right))
                    root = leftrotation(root);
                else {
                    root.left = righrotation(root.left);
                    root = leftrotation(root);
                }
            } else if (balance < -1) {
                if (height(root.right.right) >= height(root.right.left)) {
                    root = righrotation(root);
                } else {
                    root.right = leftrotation(root.right);
                    root = righrotation(root);
                }
            }
        }
        return root;
    }



    boolean isBalanced(AVL node)
    {
        int lh; /* for height of left subtree */

        int rh; /* for height of right subtree */

        /* If tree is empty then return true */
        if (node == null)
            return true;

        /* Get the height of left and right sub trees */
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        /* If we reach here then tree is not height-balanced */
        return false;
    }

    void preORder(AVL root){
        if(root!=null){
            System.out.println(root.data);
            preORder(root.left);
            preORder(root.right);
        }
    }
    public static void main(String[] args) {
        AVL ac = new AVL();
        Scanner s= new Scanner(System.in);

        int size = s.nextInt();
        while (size-->0){
            ac.insert(s.nextInt());
        }

            // ac.insert(9);
        //ac.insert(5);
       // ac.insert(30);


     //   System.out.println(ac.root.data);
        System.out.println(ac.isBalanced(ac.root));
     /*   System.out.println(ac.height(ac.root.left.left));*/
        //System.out.println(ac.height(ac.root));
   //     System.out.println(ac.BalanceFactor(ac.root.left.left,ac.root.left.right));*/
        System.out.println(ac.root.data);
        ac.Delete(40);
        System.out.println(ac.root.left.data);
        ac.Inorder(ac.root);




    }
}