package Old_practices;

import java.util.*;

class Solution{



    public static void main(String args[]) {


        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),test=1;

        while (t-- > 0) {

            int size= sc.nextInt();
            int queries=sc.nextInt();

            int first[]=new int[queries];
            int last[]=new int[queries];

            int a[] = new int[size+1];
            Integer b[] = new Integer[size+1];
            int c[] =new int[size+1];
            b[0]=0;

            for(int i=1;i<=size;i++){
                a[i]=sc.nextInt();
                b[i]=a[i];
                a[i]=a[i-1]+a[i];
            }

            for(int i=0;i<queries;i++) {
                first[i]=sc.nextInt();
                last[i]=sc.nextInt();
            }
            

            Map <Integer,Integer> UnsortedMap = new HashMap<>();
            LinkedHashMap<Integer,Integer> rever=new LinkedHashMap<>();


            for(int i=0;i<queries;i++) {
                for(int j=first[i];j<=last[i];j++){
                    Integer aa = UnsortedMap.get(j);
                    if(aa==null){
                        UnsortedMap.put(j,1);
                    }else
                        UnsortedMap.put(j,aa+1);
                }
            }

            UnsortedMap.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x ->rever.put(x.getKey(),x.getValue()));

            Arrays.sort(b,Collections.reverseOrder());


            int k=0;
            for(int j: rever.keySet()){
                c[j]=b[k];
                k++;
            }








            int sum=0,sum1=0;
            for(int i=1;i<=size;i++){
                c[i]=c[i-1]+c[i];
            }
            for(int i=0;i<queries;i++){

                sum+=a[last[i]]-a[first[i]-1];
                sum1+=c[last[i]]-c[first[i]-1];
                // System.out.print(sum);
            }
            System.out.print(sum1-sum);
        }
    }

}
