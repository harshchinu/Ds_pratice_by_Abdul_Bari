package Old_practices;

import java.util.Stack;

public class LLpracticles {
    LLpracticles head,next,tail;
    static  LLpracticles temporarary;
    char data;

    LLpracticles(char data){
        this.data=data;
        tail=next=null;
    }

    LLpracticles(){};


    void create(char  value){
        LLpracticles newnode = new LLpracticles(value);

        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            tail=newnode;
        }
    }


/*
    void duplicates(){

        HashMap<Integer,Integer> a= new HashMap<Integer,Integer>();
        LLpracticles temp=head;
        while (temp!=null){
         if(a.containsKey(temp.data)){
                int i=a.get(temp.data);
                i++;
                a.put(temp.data,i);
            }else{
                a.put(temp.data,1);
            }

            temp=temp.next;
        }

        LLpracticles tempa=head;
        LLpracticles t=tempa;
        while (tempa!=null){
            if(a.get(tempa.data)>1){
                t.next=tempa.next;
            }
            t=tempa;
            tempa=tempa.next;

        }

        
    }
*/
    void disp(){
        LLpracticles temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }


    void kthelement(int n){

        int len=0;
        LLpracticles temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        int print = 1;
        temp=head;
        while (temp!=null && len-n+1>print){
            temp=temp.next;
            print++;
        }
        System.out.println(temp.data);
    }

/*

    LLpracticles partition(int x) {
        LLpracticles newlist = new LLpracticles();

        while (head != null) {
            LLpracticles newnode = new LLpracticles(head.data);
            if (x > head.data || newlist.head==null) {
                //System.out.println(head.data);
                newnode.next = newlist.head;
                newlist.head=newlist.tail= newnode;
            } else {
                newlist.tail.next = newnode;
                newlist.tail = newnode;
            }
            head = head.next;
        }
        return newlist;

    }
*/
/*


    LLpracticles sumoflist(LLpracticles a,LLpracticles b){
        int count=0,sum=0;
        int finalsum=0;
        while (a!=null){

            sum+=a.data*Math.pow(10,count);
            count++;
            a=a.next;
        }

        finalsum+=sum;
        sum=0;
        count=0;

        while (b!=null){
            sum+=b.data*Math.pow(10,count);
            count++;
            b=b.next;
        }
        finalsum+=sum;
        LLpracticles newlist= new LLpracticles();

        while (finalsum>0){
            LLpracticles newnode = new LLpracticles(finalsum%10);
            if(newlist.head==null){
                newlist.head=newlist.tail=newnode;
            }else{
                newlist.tail.next = newnode;
                newlist.tail = newnode;
            }
            finalsum/=10;
        }
*/

        /*while (newlist.head!=null){
            System.out.println(newlist.head.data);
            newlist.head=newlist.head.next;
        }
        return newlist;
    }*/


        void palindrome(){

            Stack <Character> s = new Stack<>();
            LLpracticles temp=head;

            while(temp!=null){
                s.push(temp.data);
                temp=temp.next;
            }

            while (head!=null){
                if(head.data == s.peek()){
                    s.pop();
                }
                head=head.next;
            }

            if(s.empty()==true){
                System.out.println("its a palindrome");
            }else {
                System.out.println("not a palindrom");
            }

        }



        void insertion(LLpracticles a,LLpracticles b){
            Stack<LLpracticles> s= new Stack<>();
            Stack<LLpracticles> sa= new Stack<>();

            while (a!=null){

                s.push(a);
                a=a.next;
            }

            while (b!=null){

                sa.push(b);
                b=b.next;
            }

            LLpracticles temp=null;

            while (sa.empty()!=true && s.empty()!=true){
                if(sa.peek()==s.peek()){
                    temp=sa.peek();
                    //System.out.println(temp.data);
                }
                sa.pop();
                s.pop();
            }

                System.out.println(temp.data);
        }



    void loopdetection(){
            LLpracticles temp=head;
            LLpracticles temp1 = head;

            while (temp!=null){
                temp=temp.next.next;
                temp1=temp1.next;

                if(temp==temp1){
                    System.out.println("Loop detected");
                    break;
                }
            }
    }

    public static void main(String[] args) {


        LLpracticles c= new LLpracticles();
        c.create('m');
        c.create('a');
        c.create('d');
        c.create('a');
        c.create('m');


        //c.palindrome();
        //c=c.sumoflist(a.head,b.head);
        //c.disp();

       /* LLpracticles a = new LLpracticles();
        a.create('a');
        a.create('b');
*/

        c.tail.next=c.head.next.next;

        // a.disp();

       // c.disp();

        //a.disp();
       /* LLpracticles d = new LLpracticles();
        d.insertion(a.head,c.head);
       */// a.insertion();

        //c.disp();
        c.loopdetection();
        }
}
