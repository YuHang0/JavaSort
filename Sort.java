package main;
import static main.Print.*;

public class Sort {

    public static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    public static void exchange(Comparable[] a,int i,int j){
        Comparable tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }

    public static void show(Comparable[] a){
        final int N=a.length;
        for(int i=0;i<N;i++)
            print(a[i]+" ");
        println();
    }

    public static boolean isSorted(Comparable[] a){
        final int N=a.length-1;
        for(int i=0;i<N;i++){
            if(less(a[i+1],a[i]))
                return false;
        }
        return true;
    }

}
