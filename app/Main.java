package app;

public class Main {
    static private final String BLUE = "\u001B[34m";
    static private final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";

    static int n = 6;
    static int i;
    static int m;

    public static void main(String[] args) {
        for (i = 1; i <= n; i++) {
            m += i;
            System.out.println(BLUE + i + RESET + ") " + "Num " + RED + "is " + BLUE + i + RESET + ", " +
                    RED + "sum is " + RESET + BLUE + m + RESET);
        }
        System.out.println("_______________________\n" + "Sum of numbers " + RED + "is " + BLUE + m);
    }
}
