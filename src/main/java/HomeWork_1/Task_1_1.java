package HomeWork_1;

public class Task_1_1 {
    public static void main(String[] args) {
        double x = 4566;
        double y = 1647;
        double z = 321;
        double n = 346.512;

        System.out.printf("Результат уравнения #1 (long): %d%n", longCalculation(x,y,z,n));
        System.out.printf("Результат уравнения #2 (int): %d%n", intCalculation(x,y,z,n));
        System.out.printf("Результат уравнения #3 (float): %f%n", floatCalculation(x,y,z,n));
        System.out.printf("Результат уравнения #4 (double): %f", doubleCalculation(x,y,z,n));

    }
    static long longCalculation (double x, double y, double z, double n){
        long result1 = (long) (x - (y + 123) / z * n);
        return result1;
    }

    static int intCalculation (double x, double y, double z, double n){
        int result2 = (int) ((x + (50 - y * z) / n) - x);
        return result2;
    }

    static float floatCalculation (double x, double y, double z, double n){
        float result3 = (float) (x / (y * (z-1) - 564) + n);
        return result3;
    }

    static double doubleCalculation (double x, double y, double z, double n){
        double result4 = (-x / -y + z / (n+15));
        return result4;
    }
}
