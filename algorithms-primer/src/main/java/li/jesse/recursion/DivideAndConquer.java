package li.jesse.recursion;

/*
Recursion is a "Programming Paradigm" which is generally used to implement the "Algorithmic Paradigm" Divide and Conquer.
 */
public class DivideAndConquer {
    public static void hanoi(int level, char from, char inter, char to) {
        if (level == 1) {
            System.out.println("FROM " + from + " MOVE " + level + " TO " + to);
        }
        else {
            hanoi(level - 1, from, to, inter);
            System.out.println("FROM " + from + " MOVE " + level + " TO " + to);
            hanoi(level - 1, inter, from, to);
        }
    }

    public static int fibonacci(int i) {
        if (i==1 || i == 2) {
            return 1;
        }
        else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
