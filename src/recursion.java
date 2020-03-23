import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

public class recursion {

static  void Display(int a[]){
    int size = a.length;
    System.out.println("values in array are");
    for(int i=0;i<size;i++){
        System.out.println(a[i]);
    }
}

static  void insert(int a[]){
    int size = a.length;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter values to insert");
    for(int i=0;i<size;i++){
        a[i]=s.nextInt();
    }
}

static int[] create(){
    System.out.println("Enter size of array you want to create");
    Scanner s = new Scanner(System.in);
    int a[] = new int [s.nextInt()];
    return a;
}

static void add(int a[]){
    System.out.println("Enter value and Index where to want to add");
    Scanner s = new Scanner(System.in);
   // int value = s.nextInt();
    int index = s.nextInt();
    for(int i=index;i<a.length-1;i++){
            a[i]=a[i+1];
    }

    a[a.length-1]=Integer.MIN_VALUE;

}

static void delete(int a[]){
    Display(a);
    System.out.println("Enter Index delete");
    Scanner s = new Scanner(System.in);
    a[s.nextInt()]=-1;
}

    static void search(int a[]) {
        System.out.println("Enter value to search");
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value)
                System.out.println("Value found");

        }
        System.out.println("Value not found");
    }

    static void get(int a[]){
         System.out.println("Enter Index you want to get");
        Scanner s = new Scanner(System.in);
        System.out.println(a[s.nextInt()]);


    }

    static void max(int a[]){
    int size = a.length;
        int temp = a[0];
        for (int i = 0; i <size; i++) {
           if(a[i]>temp){
               temp=a[i];
           }

        }
        System.out.println("maximum is"+temp);
    }

    static void reverse(int a[]){
    int size = a.length;
    for(int i=0;i<size/2;i++){
        int temp = a[i];
        a[i]=a[size-i-1];
        a[size-i-1]=temp;

    }
    }

    static void rotate(int a[]){
    int size = a.length;
        int temp = a[0];
    for(int i=0;i<size-1;i++){

            a[i]=a[i+1];

        }

        a[size-1]=temp;
    }


    static void insertsorted(int[] a) {

        System.out.println("Enter Value you want to add");
        Scanner s = new Scanner(System.in);
        int value=s.nextInt();
        int temp=0;
        for(int i =a.length-2;i>=0;i--){
            if(a[i]>value){
                a[i+1]=a[i];
            }else {
                a[i+1]=value;
                break;
            }

        }}

        static void positive(int a[]){

            int i=0,j=a.length-1;
            while(i<j){
                while(a[i]<0){i++;}
                while (a[j]>=0){j--;}
                if(i<j) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }            }

        }

         static void merge(int a[],int b[]){
            int c[]=new int[a.length+b.length];
            int i=0,j=0,k=0;
            while(i<a.length && j<b.length) {
                 if (a[i] > b[j]) {
                    j++;
                } else if (b[j] >a[i]) {
                    i++;
                }else if(a[i]==b[j]){
                    c[k++] = a[i++];
                    j++;
                }

            }
//                for (; i < a.length; i++) {
//                    c[k++] = a[i];
//                }
//
//                for (; j < b.length; j++) {
//                    c[k++] = b[j];
//                }

            Display(c);
        }

        static void findmissingnumber(int a[]){
        int size=a.length;
         int sum=(a[size]*(a[size]+1))/2;
         System.out.println("sum: "+sum);
            System.out.println("size: "+size);
         int difference =0;
         for(int i=0;i<a.length;i++){
             difference+=a[i];
         }
         System.out.println(difference);
            System.out.println(sum-difference);
        }

        static void missing(int a[]){

            int l=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]-i!=l){
                    System.out.println(i+l);
                    l=a[i]-i;
                }

            }
        }

        static void hashingmissing(int a[]){
            int b[] = new int[20];

            for(int i=0;i<a.length;i++) {
                b[a[i]]++;
            }

            for(int i=1;i<=b.length;i++){
                if (b[i]>1) {
                    System.out.println(i);
                    System.out
                            .println(b[i]);
                }
            }
        }

        static void duplicate(int a[]){
    int last=0;
            for(int i=0;i<a.length-1;i++){
                if(a[i]==a[i+1] && a[i]!=last){
                        System.out.println(a[i]);
                        last=a[i];
                        }
                        }

        }

        static void sum(int a[],int sum){
                for(int i=0;i<a.length-1;i++){
                    for(int j=i+1;j<a.length;j++) {
                        if (a[i] + a[j] == sum) {
                            System.out.println(a[i] + "and" + a[j]);
                        }
                    }
                }
        }

        static void sumusinghashing(int a[],int sum){
            int b[]=new int[16];
            int temp=0;
            for(int i=0;i<a.length;i++){

                if(b[sum-a[i]]!=0){
                    System.out.println("%d,: ");
                }
                temp=a[i]-sum;
                b[temp]=1;

            }
        }

        static void summsorted(int a[],int sum) {
            int i = 0, j = a.length - 1;

            while (i < j) {

               if (a[j] + a[i] == sum) {
                   System.out.println(a[i]);
                   System.out.println(a[j]);


                    i++;
                    j--;}
               else if (a[j] + a[i] > 10) {
                   j--;
               }
                    else  if (a[j] + a[i] < sum) {
                    i++;
                }
            }
        }

    public static void main(String[] args) {
    int a[]=create();

    insert(a);
    summsorted(a,10);

        //Display(a);
    //search(a);
        }

}
