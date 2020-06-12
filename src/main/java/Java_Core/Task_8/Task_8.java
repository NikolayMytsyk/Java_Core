package Java_Core.Task_8;

import java.util.Scanner;
public class Task_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку");
        String str = in.nextLine();

        String word = "";
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == ' ') {
                System.out.print(word + " ");
                word="";
            }
            else
                word=str.charAt(i)+ word;
        System.out.println(word+" ");


    }
}

