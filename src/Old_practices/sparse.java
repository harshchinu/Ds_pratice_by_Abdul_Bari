package Old_practices;

import java.util.Scanner;

public class sparse {


    static  int[][] create(int n,int m){
        Scanner s= new Scanner(System.in);

        int a[][] = new int[n][m];

        int i=0,j=0;
        while(i<n && j<m){
            a[s.nextInt()][s.nextInt()]=s.nextInt();
            i++;j++;
        }

        /*for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[s.nextInt()][s.nextInt()]=s.nextInt();
            }
        }*/
        return a;
    }


    static  int[][] display(int a[][]){
       for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return a;
    }

    static void sparsetablerepresent(int a[][],int e) {
        int row = a.length;
        int column =a[0].length;

        int b[][] = new int[3][column];
        b[0][0]=row;
        b[1][0]=column;
        b[2][0]=e;

        

    }


    public static void main(String[] args) {
        int a[][]=create(4,5);
        display(a);
        int element=0;
       // sparsetablerepresent(a,element);

    }


}
