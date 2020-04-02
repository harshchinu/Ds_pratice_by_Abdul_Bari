class LL{
    LL head,next;
    int data;

    LL(int data) {
        this.data = data;
        next = null;

    }
    LL(){};
        void insert(int value){
            LL newnode = new LL(value);

            if(head==null){
                head=newnode;
            }
            else {
                LL temp = head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;

            }

        }

        void display(){
        if(head==null){
            System.out.println("LL doesn't exist");
        }else{
            LL temp=head;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }

        }
        }

        void rdisplay(LL head){

            if(head!=null){
                rdisplay(head.next);
                System.out.println(head.data);


            }
        }

        void count(){
            int count =0;
            while(head!=null){
                count++;
                head=head.next;
            }
            System.out.println("Node in list are :"+count);
        }

        int rcount(LL head){
            if(head==null)
                return 0;
            else
                return rcount(head.next)+1;
        }

        void sum(){
            int sum=0;
            while(head!=null){
                sum+=head.data;
                head=head.next;

            }
            System.out.println(sum);
        }

        int rsum(LL head){
            if(head!=null)
                return rsum(head.next)+head.data;
            else
                return 0;

        }

        int max(){
            int max=Integer.MIN_VALUE;
            while(head!=null){
                if(head.data > max)
                    max=head.data;
                head=head.next;

            }
            return max;
        }

        void search(int val){
            int i =0;
            while (head!=null){
                i++;
                if(head.data==val){

                    System.out.println("Value found at node"+i);
                    return;
                }

                head=head.next;
            }
        }

        void movetofront(int value){
            LL first=head;
            LL temp=null;
            while (first!=null){

                if(first.data==value){
                   temp.next=first.next;
                   first.next=head;
                   head=first;

                }
                temp=first;
                first=first.next;
            }


    }


    void insertinexisiting(int position,int value){
            LL newnode = new LL(value);
            if(head==null){
                System.out.println("LL doesnot exists");
            }
            else if(position==0){
                newnode.next=head;
                head=newnode;
            }else{
                int i=0;
                LL temp=head;
                while (i<position-1 && temp!=null){
                 temp=temp.next;
                 i++;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
    }

    void insertinsorted(int value){
            LL newnode = new LL(value);
            LL temp=head;
            LL t=null;
            while (temp!=null && temp.data < value){
                t=temp;
                temp=temp.next;
            }
        newnode.next=t.next;
        t.next=newnode;
    }

    void delete(int position){

            LL t=null;
            if(position==1){
                head=head.next;
            }else{
                int i=0;
                LL temp=head;
                while (i<position-1 && temp!=null){
                    t=temp;
                    temp=temp.next;
                    i++;
                }
                t.next=temp.next;
            }
    }

    void removingduplicated(){
            LL t1=head;
            LL t2=head.next;
        while (t2!=null) {
            if (t1.data != t2.data) {
                t1 = t2;
                t2 = t2.next;
            } else {
                t1.next = t2.next;
                t2 = t1.next;
            }
        }
        }

        void reverselink(){
            LL r=null,q=null,p=head;

            while (p!=null){
                r=q;
                q=p;
                p=p.next;
                q.next=r;
            }
            head=q;
        }
    public static void main(String[] args) {

        LL demo = new LL();
        demo.insert(10);
        demo.insert(10);
        demo.insert(30);
        demo.insert(40);
        demo.insert(40);
        demo.insert(40);
        demo.insert(50);

        //demo.rdisplay(demo.head);
        //demo.count();
        //int count =demo.rcount(demo.head);
        //System.out.println(count);
        //demo.sum();
        /*int sum=demo.rsum(demo.head);
        System.out.println(sum);
        */
        /*int max=demo.max();
        System.out.println(max);
        */
        //demo.search(4);
        //demo.movetofront(3);
        //demo.insertinexisiting(4,3);
        //demo.insertinsorted(22);
      //  demo.delete(2);
        //demo.removingduplicated();
        demo.reverselink();
        demo.display();
        //demo.transpotion(2);
        }
}