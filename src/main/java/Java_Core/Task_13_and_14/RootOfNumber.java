package Java_Core.Task_13_and_14;

public class RootOfNumber implements BinaryOperation {

    @Override
    public double resultFor(double left, double right) {
        return Math.pow(left, 1.0/right);
    }
}
