package Java_Core.Task_12;

import java.util.Scanner;
import java.util.Random;



public class Task_12 {
    private static class Point {
        public int x;
        public int y;

        Point(int x, int y) {
            this.x=x ; this.y=y;
        }

        public double distance (Point p) {
            return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
        }

    }

    private static class Triangle {
        public Point a;
        public Point b;
        public Point c;

        public double perimeter() {
            return a.distance(b)+b.distance(c)+c.distance(a);
        }
        public double square() {
            double p2 = (a.distance(b)+b.distance(c)+c.distance(a))/2.0f;
            return Math.sqrt(p2*(p2-a.distance(b))*(p2-b.distance(c))*(p2-c.distance(a)));
        }
        public int type() {
            int d1 = (int)a.distance(b);
            int d2 = (int)b.distance(c);
            int d3 = (int)c.distance(a);
            if ((d1==d2)&&(d2==d3)) return 2;
            if (d1==d2) return 1;
            if (d2==d3) return 1;
            if (d3==d1) return 1;
            if (d1*d1+d2*d2==d3*d3) return 3;
            if (d2*d2+d3*d3==d1*d1) return 3;
            if (d3*d3+d1*d1==d2*d2) return 3;
            return 4;
        }
        public String getInfo() {
            return String.format("[a(%d;%d) b(%d;%d) c(%d;%d)]",
                    a.x,a.y,b.x,b.y,c.x,c.y);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int size = 100000;
        Triangle[] arr = new Triangle[size];
        Random rnd = new Random();
        for (int i=0; i<size; i++) {
            Triangle obj = new Triangle();
            obj.a=new Point(rnd.nextInt(10),rnd.nextInt(10));
            obj.b=new Point(rnd.nextInt(10),rnd.nextInt(10));
            obj.c=new Point(rnd.nextInt(10),rnd.nextInt(10));
            arr[i]=obj ;
        }

        System.out.println("Выберите класс треугольника");
        System.out.println("1. Равнобедренный");
        System.out.println("2. Равносторонний");
        System.out.println("3. Прямоугольный");
        System.out.println("4. Произвольный");

        int ttype = in.nextInt();
        in.nextLine();

        for (int i=0; i<size; i++)
            if (arr[i].type()==ttype) {
                System.out.println("Индекс: "+Integer.toString(i));
                System.out.println("Треугольник "+arr[i].getInfo());
                System.out.println(String.format("Периметр: %f",arr[i].perimeter()));
                System.out.println(String.format("Площадь: %f",arr[i].square()));
                break;
            }
    }
}
