package HomeWork_1;

public class Task_1_2 {
    public static void main(String[] args) {

            int x = 45685;
            /*
            outputOneByOne(x);
        }

        static void outputOneByOne(int x) {
        //*/
            int a = x / 10000;
            int b = x / 1000 % 10;
            int c = x / 100 % 10;
            int d = x / 10 % 10;
            int e = x % 10;

            System.out.printf("%d%n%d%n%d%n%d%n%d%n%d",x,a,b,c,d,e);

        }
}
