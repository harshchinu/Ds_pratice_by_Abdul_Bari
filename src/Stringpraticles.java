public class Stringpraticles {

    void isUnique(String a){
        int ab[] = new int[25];

        for(int i=0;i<a.length();i++){
            ab[a.charAt(i)-97]+=1;
        }
        int flag=0;
        for(int i=0;i<ab.length;i++){
            if(ab[i]>1) {
                flag=1;
                System.out.println("String is not unique");
            }
        }
        if(flag==0){
            System.out.println("String is unique");
        }
    }

    void ispermutation(String a,String b){
        int ab[] = new int[25];
        if(a.length()==b.length()){
            for(int i=0;i<a.length();i++){
                ab[a.charAt(i)-97]+=1;
            }

            for(int i=0;i<a.length();i++){
                ab[b.charAt(i)-97]-=1;
            }

            int flag=0;

            for(int i=0;i<ab.length;i++){
                if(ab[i]>0) {
                    flag=1;
                    System.out.println("String is not permutatioion");
                }
            }
            if(flag==0){
                System.out.println("String is permutation");
            }
        }
    }

    void urlify(char a[]){

     //   StringBuffer s = new StringBuffer(a);

        int spaecount=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] == ' ') {
                spaecount++;
            }
        }
        int length=a.length-2;
            int index=0;
            index=length+spaecount*2;

            System.out.println(a.length);
            System.out.println(index);

            for(int i=length-1;i>=0;i--){
                if(a[i]==' '){
                    a[index-3]='0';
                    a[index-2]='2';
                    a[index-1]='%';
                    index=index-3;
                }
                else{
                    //a.insert(index-1,s.charAt(i));
                    a[index-1]=a[i];
                    index--;
                }
            }

            for(char c : a){
                System.out.print(c);
            }


    }


    boolean ispermutationpalindrom(String s){
        int char_counts[] = new int[128];

        for(int i=0;i<s.length();i++){
            char_counts[s.charAt(i)]++;
        }

        int counts=0;

        for(int i =0;i<char_counts.length;i++){
            counts += char_counts[i] %2;
        }

        return counts <=1;
    }

    boolean One_Away(String s,String so) {
        int flag = 0;

        if (s.length() == so.length()) {


            if (s.equals(so)) {
                flag++;
            } else {
                int i = 0;
                int j = 0;
                while (i < s.length() && j < s.length()) {
                    if (s.charAt(i) == so.charAt(j)) {
                        i++;
                        j++;
                    } else {
                        flag--;
                        break;
                    }
                }


            }
            return flag <= 1;
        }
        return true;
    }


    String stringcompression(String s){
        int count=0;
        String sa="";
        StringBuffer saa = new StringBuffer();
        int i=0;
        for(i=0;i<s.length()-1;i++){
            count++;
            if(s.charAt(i)!=s.charAt(i+1)){
                sa+=""+s.charAt(i)+count;
                count=0;
            }

            if(i==s.length()-2){
             //   if(s.charAt(i)!=s.charAt(i+1)) {

                    sa += "" + s.charAt(i+1) + (++count);
               // }
            }

        }
        return sa;
    }


    void rotate(int a[][]){
        if(a.length==0|| a.length!=a[0].length)
            return;
        int n = a.length;
        for(int layer=0;layer<n/2;layer++){
            int first=layer;
            int last = n-1-layer;
            for(int i=first;i<last;i++){
                int offset=i-first;

                int top=a[first][i];
                a[first][i]=a[last-offset][first];

                a[last-offset][first]=a[last][last-offset];

                a[last][last-offset]=a[i][last];

                a[i][last]=top;

            }

        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }


    void isZero(int a[][]) {

        boolean row = false;
        boolean col = false;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[0][j] == 0) {
                    row = true;
                    break;

                }
            }
        }


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][0] == 0) {
                    col = true;
                    break;

                }
            }
        }


        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[0].length; j++) {
                if (a[0][j] == 0) {

                    a[i][0] = 0;
                    a[0][j] = 0;
                }
            }
        }


    }
    public static void main(String[] args) {

        Stringpraticles s =new Stringpraticles();
        //s.isUnique("helo");
        //s.ispermutation("hal","ahl");

        //char a[]={'H','E','L','L','O',' ','W','O','R','L','D','_','_'};
        //s.urlify(a);
        //boolean t=s.ispermutationpalindrom("aa");
       // boolean t=s.One_Away("pale","bae");
       // System.out.println(t);

        //String a=s.stringcompression("aabbbbbccccdddda");
       // System.out
         //       .println(a);

    int a[][]={{1,2,0},{4,5,6},{7,8,9}};
    //s.rotate(a);
        s.isZero(a);
    }
}
