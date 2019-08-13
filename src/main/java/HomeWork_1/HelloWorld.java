package HomeWork_1;

import java.util.Scanner;

public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        System.out.printf("%d * %d = %d", x, y, x * y);
    }
}
