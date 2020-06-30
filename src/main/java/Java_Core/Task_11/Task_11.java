package Java_Core.Task_11;
import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер квадрата: ");
        int size = in.nextInt(); in.nextLine();

        int[][] arr = new int[size][size];

        int k = 1;
        for (int i=0; i<2*size; i++)
            for (int q=0; q<=i; q++)
                if ((i-q<size)&&(q<size)) {
                    if (i % 2 == 1)
                        arr[i-q][q]=k;
                    else
                        arr[q][i-q]=k;
                    k++;
                }

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++)
                System.out.print(String.format("%-3d ",arr[i][j])) ;
            System.out.println("") ;
        }

    }
}
