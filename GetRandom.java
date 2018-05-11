package main;
import java.util.Random;

public class GetRandom {

    public static Integer[] integers() {
        Random rand = new Random();
        final int len = Math.abs(rand.nextInt()) % 50;
        Integer[] a = new Integer[len];
        for (int i = 0; i < len; i++)
            a[i] = Math.abs(rand.nextInt()) % 50;
        return a;
    }

}
