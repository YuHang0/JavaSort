package main;
import static main.Print.*;

public class Shell extends Sort {

    public static void sort(Comparable[] a) {
        final int N = a.length, th = N / 3;
        int h = 1;
        while (h < th) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                Comparable tmp = a[i];
                int j = i - h;
                for (; j >= 0 && less(tmp, a[j]); j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
            h /= 3;
        }
    }

}