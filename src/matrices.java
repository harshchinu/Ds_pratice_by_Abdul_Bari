import java.util.Scanner;

public class matrices {

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


    static void display(int a[][]){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");


            }
            System.out.println();
        }
    }

    static void isitdiagonal(int a[][]){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){


                    if(a[i][j]==a[i-1][j-1]){
                        System.out.println("matrices is diagonal");
                    }

        }
    }


    }

    static void isitlowertrianglular(int a[][]){
        for(int i=1;i<a.length;i++){
                for(int j=0;i>j;j++){
                if(a[i][j]==0){
                        System.out.println("matrices is diagonal");
                    }
                else{
                    System.out.println("not");
                }

            }
        }


    }

    static void createlowertriangle(int a[][]){
        Scanner s= new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                int temp=s.nextInt();
                a[i][j]=temp;
                a[j][i]=temp;
            }
        }


    }
    public static void main(String[] args) {
        int a[][]=create();

      isitdiagonal(a);
    int b[][] = new int[5][5];
    ///createlowertriangle(b);
    //display(b);
    //isitlowertrianglular(b);
    }
}
