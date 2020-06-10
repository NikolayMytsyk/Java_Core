package Java_Core.Task_5;

public class Task_5 {

    public static void main(String[] args) {

        long x = 15875;
        outputOneByOne(x);

    }


private static void outputOneByOne(long x) {

        long a = x / 10000;
        long b = x / 1000 % 10;
        long c = x / 100 % 10;
        long d = x / 10 % 10;
        long e = x % 10;
        long max = 0;
        long min = 0;


        if (a < b && a < c && a < d && a < e) {
            min = a;
        }
        else if (b < a && b < c && b < d && b < e){
            min = b;
        }
        else if (c < a && c < b && c < d && c < e){
            min = c;
        }
        else if (d < a && d < b && d < c && d < e){
            min = d;
        }
        else if (e < a && e < b && e < c && e < d){
            min = e;
        }
        System.out.println("Наменьшее: " + min);


        if (a > b && a > c && a > d && a > e){
            max = a;
        }
        else if (b > a && b > c && b > d && b > e){
            max = b;
        }
        else if (c > a && c > b && c > d && c > e){
            max = c;
        }
        else if (d > a && d > b && d > c && d > e){
            max = d;
        }
        else if (e > a && e > b && e > c && e > d){
            max = e;
        }
        System.out.println("Наибольшее: " + max);


        }
}