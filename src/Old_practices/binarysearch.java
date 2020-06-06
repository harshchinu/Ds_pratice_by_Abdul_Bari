package Old_practices;

public class binarysearch {
    static int binarys(int l,int h,int a[],int key){

    /*{
        int m=(l+h)/2;
        if(key==a[m]){
            System.out.println(m);
        }else if( key >a[m]){
            binarys(l=m,h,a,key);
        }else if(key < a[m]){
            binarys(l,h=m,a,key);
        }*/
    while(l<=h){
        int m=(l+h)/2;
        if(key==a[m]){
            return m;
        }
        else if(key<a[m+1]){
            h=m-1;
        }
        else{
            l=m+1;
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
       int finala= binarys(0,a.length-1,a,650);
        System.out.println(finala);
    }
}
