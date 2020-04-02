public class stackLL {
    stackLL next,head;
    char data;

    stackLL(char data){
        this.data=data;
        next=null;

    }

    stackLL(){};

    void push(char  value){
        stackLL newnode = new stackLL(value);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;

        }
    }

    void pop(){
        head=head.next;
    }

    void peek(){
        System.out.println(head.data);
    }


    void parathesismathching(char c){
        stackLL s = new stackLL(c);
        if(head==null){
            head=s;
        }else if(head.data==')'){
            head=head.next;
        }else{
            s.next=head;
            head=s;
        }

    }


    public static void main(String[] args) {

        stackLL ss = new stackLL();
        ss.parathesismathching('(');
        ss.parathesismathching('(');
        ss.peek();

    }
}
