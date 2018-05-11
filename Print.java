package main;

public class Print {

    public static void print(Object object) {
        System.out.print(object);
    }

    public static void println(Object object) {
        System.out.println(object);
    }

    public static void println() {
        System.out.println();
    }

    public static void printf(String s, Object... objects) {
        System.out.printf(s, objects);
    }

    public static void print_init(String string) {
        System.out.printf("[loop = -] : %s\n", string);
    }

    public static void print_loop(int i, String string) {
        System.out.printf("[loop = %d] : %s\n", i, string);
    }

}