public class Queue {

    int a[]=new int [5];
    int front=-1,rear=-1;

    void enqueue(int value){
      if(rear<a.length-1)
        a[++rear]=value;
    }

    void dequeu(){
        if(front!=rear)
        System.out.println(a[++front]);
    }

    void first(){
        System.out.println(a[front+1]);
    }

    void last(){
        System.out.println(a[rear]);
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(1);
        q.enqueue(2);
        q.first();
        q.last();
        q.enqueue(3);
        q.last();
        q.dequeu();
        q.first();
    }
}
