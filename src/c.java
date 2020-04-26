
import java.awt.print.PrinterGraphics;
import java.lang.ref.WeakReference;
import java.security.KeyPair;
import java.util.*;
import java.io.*;

class Solution{



    public static void main(String args[]) {

        /*
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt(),test=1;
        Scanner s = new Scanner(System.in);

        while (t-- > 0) {
            int rank = s.nextInt();
            int suit = s.nextInt();

            int a[][] = new int[rank][suit];


        }
        }*/
        Integer a =1;
        WeakHashMap<Integer,Integer> w = new WeakHashMap<>();
        w.put(a,a);
        System.out.println(w.get(a));
        a = null;
        System.gc();
        System.out.println(w.get(a));

    }
    }
