package Java_Core.Task_13_and_14;

public class Exponentiations implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, right);
    }
}
