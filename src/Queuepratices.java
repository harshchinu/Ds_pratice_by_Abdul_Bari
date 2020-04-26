import java.util.LinkedList;
import java.util.Queue;

public class Queuepratices {
    String data;
    Queuepratices front,rear,dogfront,catfront,next;
    Queuepratices(){};

    Queuepratices(String a) {
        this.data = a;
    }

    void enqueue(String v){

        Queuepratices a = new Queuepratices(v);

        if(front==null){
            dogfront=catfront=front=rear=a;
        }else{
            rear.next=a;
            rear=a;
        }
    }

    void dequeueAny(){
        if(front==null){
            System.out.println("Queue is empyty");
        }else{
            System.out.println("You got a "+front.data);
            front=front.next;
        }
    }

    void dqeueuedog(){
        if(front==null){
            System.out.println("Queue is empyty");
        }else{
            while (dogfront.data!="dog"){
                dogfront=dogfront.next;
            }
            System.out.println(dogfront.data);
            dogfront=dogfront.next;

        }
    }

    void dqeueuecat(){
        if(front==null){
            System.out.println("Queue is empyty");
        }else{
            while (catfront.data!="cat"){
                catfront=catfront.next;

            }
            System.out.println(catfront.data);
            catfront=catfront.next;

        }
    }
    public static void main(String[] args) {

        Queuepratices q = new Queuepratices();
        q.enqueue("dog");
        q.enqueue("cat");
        q.enqueue("cat");
        q.enqueue("dog");
        q.enqueue("dog");
        q.enqueue("cat");
        q.enqueue("dog");

        q.dequeueAny();
        q.dequeueAny();
        q.dqeueuedog();
        q.dqeueuecat();



    }
}
