package main;
import static main.Print.*;

public class Main {

    public static void main(String... args) {
        Integer[] a = GetRandom.integers();
        Integer[] b = a.clone();

        Sort.show(a);
        Merge.sort(a);
        Sort.show(a);
        println("isShuffled:" + Test.isShuffled(a, b));
        println("isSorted:" + Sort.isSorted(a));
    }

}