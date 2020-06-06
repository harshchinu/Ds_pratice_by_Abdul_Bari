package CTCI;

public class minimal_tree {
    minimal_tree root,left,right;
    int data;


    minimal_tree(int data){
        this.data=data;
        left=right=null;
    }
    minimal_tree(){};

    void create(int a[]){
            root = createbinartytree(a, 0, a.length - 1);

    }

    private minimal_tree createbinartytree(int[] a,int low,int high) {
        if(high<low){
            return null;
        }
        int mid=(low+high)/2;
        minimal_tree node=new minimal_tree(a[mid]);
        node.left = createbinartytree(a, low, mid - 1);
        node.right = createbinartytree(a, mid+1, high);
        return node;
    }

    int getHeight(minimal_tree root){
        if(root==null)
            return -1;
        int x=getHeight(root.left);
        int y = getHeight(root.right);

        return x>y?x+1:y+1;
    }

    void isBalanced(int root){

    }

    void preorder(minimal_tree root){
        if(root!=null){
            System.out.print(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60};

        minimal_tree m = new minimal_tree();
        m.create(a);

        m.preorder(m.root);
    }
}
