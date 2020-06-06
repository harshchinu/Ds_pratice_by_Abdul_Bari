package Old_practices;

public class Queue {

    int a[]=new int [5];
    int front=-1,rear=-1;

    void enqueue(int value){
        if((rear+1)%a.length==front){
            System.out.println("Queue is full");
        }else{
            rear=(rear+1)%a.length;
        a[rear]=value;
        }
    }

    void dequeu(){
        if(front==rear){
            System.out.println("Queue is empy");
        }else{

            System.out.println(a[(front+1)%a.length]);
            front=(front+1)%a.length;
        }

    }

    void last(){
        System.out.println(a[rear]);
    }


    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        //q.enqueue(5);
        q.dequeu();
        q.enqueue(6);
        q.last();
        //q.dequeu();

    }
}
