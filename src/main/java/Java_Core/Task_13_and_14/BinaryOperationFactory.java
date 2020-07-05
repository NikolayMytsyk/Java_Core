package Java_Core.Task_13_and_14;

public class BinaryOperationFactory {
    public BinaryOperation getOperationFor(Operator operator) {
        switch (operator) {
            case PLUS:
                return new Addition();
            case MINUS:
                return new Substraction();
            case MULTIPLICATION:
                return new Multiplication();
            case DIVISION:
                return new Division();
            case EXPONENTION:
                return new Exponentiations();
            case SQRT:
                return new RootOfNumber();
            case LOG:
                return new Logarithm();
            default:
                System.out.println("Неизвестная операция " + operator);
                return null;
        }
    }
}
