package Java_Core.Task_7;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите строку") ;
        String str = in.nextLine() ;

        boolean isok = true ;
        for (int i=0; i<str.length()/2; i++)
            if (str.charAt(i)!=str.charAt(str.length()-i-1)) isok=false ;

        if (isok)
            System.out.println("ДА") ;
        else
            System.out.println("НЕТ") ;

    }
}
