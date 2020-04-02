public class DLL {
    DLL prev,next,head,tail;
    int data;

    DLL(int data){
        this.data=data;
        prev=next=null;
    }

    DLL()
    {};
    void create(int value){
        DLL newnode = new DLL(value);

        if(head==null){
            head=tail=newnode;
        }
        else{
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;

            //tail=newnode;
        }
    }

    void display(){
        DLL temp =head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

        while (temp.prev!=null){
            System.out.println(tail.data);
            temp=temp.prev;
        }
    }



    public static void main(String[] args) {
        DLL d = new DLL();

        d.create(1);
        d.create(2);
        d.create(3);
        d.create(4);

        d.display();


    }
}

