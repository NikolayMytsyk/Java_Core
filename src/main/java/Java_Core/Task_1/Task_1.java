package Java_Core.Task_1;

public class Task_1 {
    public static void main(String[] args) {
        double x = 4566;
        double y = 1647;
        double z = 321;
        double n = 346.512;

        System.out.printf("Результат уравнения #1 (long): %d%n", calculationEquationLong(x,y,z,n));
        System.out.printf("Результат уравнения #2 (int): %d%n", calculationEquationLInt(x,y,z,n));
        System.out.printf("Результат уравнения #3 (float): %f%n", calculationEquationFloat(x,y,z,n));
        System.out.printf("Результат уравнения #4 (double): %f", calculationEquationDouble(x,y,z,n));

    }
    private static long calculationEquationLong (double x, double y, double z, double n){
        return (long) (x - (y + 123) / z * n);
    }

    private static int calculationEquationLInt (double x, double y, double z, double n){
        return (int) ((x + (50 - y * z) / n) - x);
    }

    private static float calculationEquationFloat (double x, double y, double z, double n){
        return (float) (x / (y * (z-1) - 564) + n);
    }

    private static double calculationEquationDouble (double x, double y, double z, double n){
        return (-x / -y + z / (n+15));
    }
}
