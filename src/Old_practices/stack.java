package Old_practices;

public class stack {

    int a[] = new int[4],top=-1;



    void push( int value){
        top++;
        a[top]=value;
    }

    void pop(){
        a[top]=Integer.MIN_VALUE;
        top--;
    }

    void peek(){
        System.out.println(a[top]);
    }

    void isStackempty(){
        if(top==-1){
            System.out.println("Stack is empty");
        }
    }

    void isStackfull(){
        if(top==a.length){
            System.out.println("Stack is full");
        }
    }
    public static void main(String[] args) {

        stack s =new stack();
        s.isStackempty();
        s.push(1);
        s.push(2);
        s.push(3);
        s.peek();
        s.pop();
        s.peek();
        s.push(4);
        s.peek();
    }
}
