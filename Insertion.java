package main;

public class Insertion extends Sort {

    public static void sort(Comparable[] a) {
        //将数组做升序排列
        final int N = a.length;
        for (int i = 1; i < N; i++) {
            Comparable tmp = a[i];
            int j = i - 1;
            for (; j >= 0 && less(tmp, a[j]); j--)
                a[j + 1] = a[j];
            a[j + 1] = tmp;
        }
    }

}
