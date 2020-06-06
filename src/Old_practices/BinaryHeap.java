package Old_practices;

public class BinaryHeap {

    public static void main(String[] args) {


        int a[]={10,20,30,40,50,60,70,80};

       // createmaxheap(a);

        heapify(a);
     /*  for(int n=a.length-1;n>0;n--) {
            deletekey(a, n);
        }*/

      //  deletekey(a,7);


        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }



    private static void heapify(int[] a) {
        int i=a.length-1;
        int j = i*2+1;
        int k = i*2+2;
        while (i>0){
            if(i!=a.length-1) {
                System.out.println(i);
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[j] = a[i];
                    a[j] = temp;
                }
                if (a[k] > a[i]) {
                    int temp = a[i];
                    a[k] = a[i];
                    a[i] = temp;
                }

            }
            i--;
        }
    }

    private static void deletekey(int a[],int n) {
        int x = a[0];
        a[0] = a[n];
        a[n]=x;
        int i = 0, j = (2 * i) + 1;

        // a[0]=a[a.length-1];

        while (j < n-1) {
            if (a[j + 1] > a[j])
                j = j + 1;


            if (a[i] < a[j]) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i = j;
                j = (2 * j) + 1;
            } else {
                break;
            }

        }

    }

    private static void createmaxheap(int[] a) {
        for(int i=0;i<a.length;i++){
            InsertMax(a,i);
        }
    }

    private static void InsertMax(int[] a, int i) {
        int temp,n=i;
        temp=a[n];
        while (n>0 && temp>a[(n-1)/2]){
            a[n]=a[(n-1)/2];
            n=(n-1)/2;
        }
        a[n]=temp;
    }
}

