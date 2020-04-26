import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stackpratcles {


   /*
   stack for getting minimun value from stack in O(1)
    int min=Integer.MAX_VALUE;
    int a[] = new int[15];
    int top=-1;

    void push(int value){
        if(top==a.length){
            System.out.println("Stack is full");
        }
        else{
            a[++top]=value;
            if(value<min){
                min=value;
            }
        }
    }

    void min(){
        System.out.println(min);
    }*/


/*
    3 stack in a singlw array
    int fullstack[] = new int[9];
    int p1=3,p2=6,p3=9;


    void push(int stack,int value){
        if(stack==1){
            p1=pushed(p1,value);
        }

        if(stack==2){
            p2=pushed(p2,value);
        }

        if(stack==3){
            p3=pushed(p3,value);

        }
    }

    int pushed(int poiter,int value){
        fullstack[poiter]=value;
        poiter++;

        return poiter;
    }

    void pop(int stack){
        if(stack==1){
            System.out.println(p1);
            p1--;
        }

        if(stack==2){
            System.out.println(p2);
            p2--;
        }

        if(stack==3){
            System.out.println(p3);
            p3--;

        }
    }
*/

/*

Queue by using stack

    Stack<Integer> s = new Stack<>();
    Stack<Integer> s1 = new Stack<>();


    void push(int value){
            s.push(value);
    }

    void pop() {
        if (s1.empty()) {
            while (s.empty() != true)
                s1.push(s.pop());

        }
        while (s1.empty() != true) {
            System.out.println(s1.pop());
        }
    }
*/
/*

Sort Stacck

Stack<Integer> s = new Stack<>();
Stack<Integer> s2 = new Stack<>();
void push(int value){
    if(s.isEmpty()){
        s.push(value);
    }else if(s.peek()<value){
    s2.push(s.pop());
    s.push(value);
    s.push(s2.pop());
    }else{
        s.push(value);
    }



}

void pop(){
    System.out.println(s.peek());
}
*/

    List<Stack<Integer>> listofstack;
    int threshold = 5;


    void push(int value) {

        if (listofstack.size() == 0) {
            createnewlist(value);
        } else {
            Stack<Integer> last = getlaststack();
            if (last != null) {
                if (last.size() >= threshold) {
                    createnewlist(value);
                } else {
                    last.push(value);
                }
            }

        }
    }

    void pop() {
        Stack<Integer> last = getlaststack();
        int i = last.pop();

        if (last.size() == 0) {
            listofstack.remove(listofstack.size() - 1);
        }
        System.out.println(i);
    }

    void createnewlist(int va) {
        Stack<Integer> s = new Stack<>();
        s.push(va);
        listofstack.add(s);
    }

    Stack<Integer> getlaststack() {
        if (!listofstack.isEmpty())
            return listofstack.get(listofstack.size() - 1);

        return null;
    }


    public static void main(String[] args) {

     stackpratcles ss = new stackpratcles();

        ss.push(1);
        ss.push(5);
        ss.push(2);


    }
}
