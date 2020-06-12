package Java_Core.Task_9;

import java.util.Scanner;
import java.util.Random;
public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длину массива");
        int size = in.nextInt(); in.nextLine();

        int[] arr = new int[size];
        Random rnd = new Random();
        for (int i=0; i<size; i++)
            arr[i]=rnd.nextInt(100);

        for (int i=0; i<size; i++)
            System.out.print(Integer.toString(arr[i])+" ");
        System.out.println("");

        for (int i=0; i<size; i++)
            if (arr[i] % 3 == 0)
                System.out.print(Integer.toString(arr[i])+" ");
        System.out.println("");

    }
}
