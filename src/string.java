public class string {

    static void palindrome(char a[],char b[]){
        int h[] = new int[25];

        for(int i=0;i<a.length;i++){
            int c=a[i]-97;
            h[c]+=1;
        }
        for(int i=0;i<a.length;i++){
            int c=b[i]-97;
            h[c]-=1;
        }

        for(int i=0;i<h.length;i++){
            if(h[i]<0){
                System.out.println("Not an angram");
                break;
            }
        }
                System.out.println("An angram");
            }

    static void permutation(char a[]){
        int flag[] = new int[a.length];
        char result[] = new char[a.length];
        int i=0,k=0;



    }


    public static void main(String[] args) {
        char a[]={'m','e','d','i','c','a','l'};
        char b[]={'d','e','c','i','m','a','l'};

        palindrome(a,b);

    }
}
