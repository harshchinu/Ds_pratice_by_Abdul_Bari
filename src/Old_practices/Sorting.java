package Old_practices;

import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;

public class Sorting {
    public static void main(String[] args) {
        int a[] = {5,3,2,0,1};

       // bsort(a,a.length);

      //  insertsort(a,a.length);

      //  selectionsort(a,a.length);

       // quicksort(a,0,5);

       // mergesort(a,a.length);

   //     rmergersort(a,0,a.length-1);

       countsort(a);
     //   shellsort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }

    private static void shellsort(int[] a) {
        int gap = (0+a.length)/2;
        int i=0;
        while (gap>0){
            if(a[i]>a[i+gap])
                swap(a,i,i+gap);
            
        }
    }

    private static void countsort(int[] a) {
        int max = 5;
        int b[]=new int[max+1];

        for(int i=0;i<a.length;i++){
            b[a[i]]++;
        }
        int j=0;
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                a[j++]=i;
            }
        }
    }

    private static void rmergersort(int[] a, int i, int i1) {
        if(i<i1){
            int mid = (i+i1)/2;
            rmergersort(a,i,mid);
            rmergersort(a,mid+1,i1);
            merge(a,i,mid,i1);
        }
    }

    private static void mergesort(int[] a, int length) {
        int i,l,p,mid,high;

        for(p=2;p<=length;p=p*2){

            for(i=0;i+p-1<length;i=i+p){
                l=i;
                high=i+p-1;
                mid=(l+high)/2;
                merge(a,l,mid,high);
            }
        }
        if(p/2<length){
            merge(a,0,p/2-1,length-1);
        }
    }


    static void merge(int[] a, int l, int mid, int h){
        int b[] = new int[h+1];
        int i=l,j=mid+1,k=l;

        while(i<=mid && j<=h){
            if(a[i]<a[j])
                b[k++]=a[i++];
            else
                b[k++]=a[j++];

        }
        for(;i<=mid;i++){
            b[k++]=a[i];
        }

         for(;j<=h;j++){
             b[k++]=a[j];
         }

         for(int lk=l;lk<=h;lk++){
             a[lk]=b[lk];
         }
    }
    private static void quicksort(int[] a,int i, int length) {
        int j;
        if(i<length){
            j=partiton(a,i,length);
            quicksort(a,i,j);
            quicksort(a,j+1,length);
        }
    }

    private static int partiton(int[] a, int l, int length) {
        int pivot = a[l];
        int i=l,j=length;

        do{
            do{i++;}while (a[i]<=pivot);

            do{j--;}while (a[j]>pivot);

                if(i<j)swap(a,i,j);

        }while(i<j);
        swap(a,l,j);
        return j;
    }

    private static void selectionsort(int[] a, int length) {
        for(int i=0;i<length;i++){
            int j=i,k=i;
            while (j<length-1){
                j++;
                if(a[k]>a[j]){
                    k=j;
                }
            }
            swap(a,k,i);
        }
    }

    private static void insertsort(int[] a, int length) {
        for(int i=1;i<length;i++){
            int j=i-1,x=a[i];
            while (j>-1&&a[j]>x) {
                a[j + 1] = a[j];
                j--;
            }
            a[j+1]=x;
        }
    }


    public  static  int[] swap(int ab[], int a,int b){

        int temp = ab[a];
        ab[a]=ab[b];
        ab[b]=temp;

        return ab;
}
    private static void bsort(int[] a,int n) {
        int flag =0;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                  swap(a,j,j+1);
                  flag=1;
                }
                if(flag==0)
                    break;
            }

        }
    }
}
