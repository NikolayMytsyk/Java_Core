package Java_Core.Task_6;

import java.util.Scanner;

public class Task_6 {

    private static int calcDialogFor(int num) {
        if (num == 1) return 0;
        else return (num - 1) + calcDialogFor(num - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.printf("Введите текущее количество программистов: ");
        int num = in.nextInt();
        in.nextLine();

        int count = calcDialogFor(num);
        System.out.println("Всего собеседований = " + Integer.toString(count));


    }
}