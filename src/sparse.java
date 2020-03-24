import java.util.Scanner;

public class sparse {


    static  int[][] create(){

        System.out.println("Enter the size of n*n matrices");
        Scanner s= new Scanner(System.in);
        int a[][] = new int[s.nextInt()][s.nextInt()];

        System.out.println("Enter values of matrices");

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=s.nextInt();
            }
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
        int a[][]=create();
        int element=0;
        sparsetablerepresent(a,element);

    }


}
