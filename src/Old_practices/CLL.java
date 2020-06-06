package Old_practices;

public class CLL {
    CLL head,next,tail;
    int data;

    CLL(int data){
        this.data=data;

    }

    CLL(){};

    void create(int value){
        CLL newnode= new CLL(value);
        if(head==null){
            head=newnode;
            tail=newnode;
            newnode.next=head;
           // newnode.next=head;
        }else{
            tail.next=newnode;
            tail=newnode;
            tail.next=head;
        }

    }

    void display(){
        CLL temp=head;
        if(temp==null){
            System.out.println("LL doesn't exist");
        }else{
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }
            while(temp!=head);

            }


    }

    void insertat(int position,int value){
        CLL newnode = new CLL(value);
        int i=0;
         if(head==null){
             System.out.println("CLL doesnot exists");
         }
         else if(position==0){
             newnode.next=head;
             head=newnode;
             tail.next=head;
        }
         else{
             CLL temp =head;
             while (i<position-1 && temp.next!=head){
                 temp=temp.next;
             }
             newnode.next=temp.next;
             temp.next=newnode;

         }

    }


    public static void main(String[] args) {

        CLL a = new CLL();
        a.create(1);
        a.create(2);

        a.create(3);
        a.create(4);
        a.create(5);

        //a.insertat(0,5);
        a.insertat(7,6);
        a.display();

    }
}
