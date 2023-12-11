package RecursiveOutputOfNumbers;

import java.util.Scanner;

public class Main {
    public static void recursion(int bound, int currentNumber) {
        System.out.println(currentNumber);
        if(currentNumber == bound) {
            return;
        }
        recursion(bound, currentNumber + (currentNumber < bound ? 1 : -1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        recursion(b, a);
    }
}
