package Java_Core.Task_4;
import java.util.Scanner;

public class Task_4 {
    static final int STARS = 4;

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        console.useDelimiter("\n");

        final String str1 = "Course: Java core";
        final String str2 = "Student";
        System.out.println("Введите ваше ФИО: ");
        String str3 = console.next();

        int maxStringLength = getMaxStringLength(str1, str2, str3);

        stars(maxStringLength);
        title(str1, maxStringLength) ;
        title(str2, maxStringLength) ;
        title(str3, maxStringLength) ;
        stars(maxStringLength);

    }

    public static void stars(int maxLength){
        for (int i = 0; i < (maxLength + STARS); i++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void title(String str, int maxLength){
        System.out.print("* ");

        int leftIndent = getLeftIndent(maxLength, str) ;
        for (int i = 0; i < leftIndent; i++){
            System.out.print(" ");
        }

        System.out.print(str);

        int rightIndent = getRightIndent(maxLength, str) ;
        for (int i = 0; i < rightIndent; i++){
            System.out.print(" ") ;
        }

        System.out.println(" *");
    }

    public static int getLeftIndent(int maxLength, String str){
        int x = (maxLength - str.length())/2;
        return x;
    }

    public static int getRightIndent(int maxLength, String str){
        int x = (maxLength - str.length()) - getLeftIndent(maxLength, str);
        return x;
    }

    public static int getMaxStringLength(String str1, String str2, String str3)
    {
        int maxStringLength ;
        if (str1.length() > str2.length()) {
            maxStringLength = str1.length() ;
        }
        else {
            maxStringLength = str2.length() ;
        }

        if (str3.length() > maxStringLength) {
            maxStringLength = str3.length() ;

        }
        return maxStringLength ;
    }
}
