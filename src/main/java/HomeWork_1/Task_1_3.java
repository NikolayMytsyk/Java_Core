package HomeWork_1;

public class Task_1_3 {
    public static void main(String[] args) {
        int x = 1;
        int y = -2;
        int z = 3;

        double length = Math.sqrt(x * x + y * y + z * z);

        double e1  = x / length;
        double e2  = y / length;
        double e3  = z / length;

        System.out.printf("Единичный вектор для вектора (%d,%d,%d)",x,y,z);
        System.out.printf(" => (%f,%f,%f)",e1,e2,e3);

    }

}

