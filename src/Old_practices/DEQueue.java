package Old_practices;

public class DEQueue {


    int f1 =-1,r1=-1,f2 =-1,r2=-1,f3 =-1,r3=-1;
    char q1[] = new char[5];
    char q2[] = new char[5];
    char q3[] = new char[5];


    void enqueue(char value, int pr){

        if(pr==1){
            r1=enque(q1,f1,r1,value);
            System.out.println(r1);
        }
        if(pr==2){

            r2=enque(q2,f2,r2,value);
            System.out.println(r2);
        }
        if(pr==3){

            r3=enque(q3,f3,r3,value);
        }
    }


    int enque(char q[],int f,int r,char v){
        if(r==q.length)
            System.out.println("Queue is full");
        else

            q[++r]=v;

        return r;
    }

    void dequeue(){

        while (f1!=r1){
          System.out.println(q1[++f1]);

      }
        while (f2!=r2){
            System.out.println(q2[++f2]);

        }
        while (f3!=r3){
            System.out.println(q3[++f3]);
        }


    }

    public static void main(String[] args) {
        DEQueue q = new DEQueue();
        q.enqueue('A',1);

        q.enqueue('b',1);

        q.enqueue('c',2);

        q.dequeue();
        q.dequeue();
        q.dequeue();

    }
}
