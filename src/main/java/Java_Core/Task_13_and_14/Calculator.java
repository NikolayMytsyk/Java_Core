package Java_Core.Task_13_and_14;

import java.util.Scanner;

public class Calculator {
    private double calculate(double val1, double val2, String operator) {
        Operator oprtr = Operator.getOperatorFromString(operator);
        BinaryOperationFactory bof = new BinaryOperationFactory();
        BinaryOperation operation = bof.getOperationFor(oprtr);

        if (operation == null) {
            System.out.println("Неизвестный оператор " + operator);
            return Double.NaN;
        }
        return operation.resultFor(val1, val2);
    }

    private String getInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        while (input.isEmpty() || input.length() < 5) {
            System.out.println("Неправильно выражение, попробуйте ещё раз:");
            input = scan.nextLine();
        }
        return input;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Введите выражение с пробелами между цифрами и оператором\nПример: 3 + 5\n");

        String input = calculator.getInput();
        Parser parser = new Parser();

        double val1 = Double.valueOf(parser.parse(input)[0]);
        double val2 = Double.valueOf(parser.parse(input)[2]);
        String operator = parser.parse(input)[1];

        double res = calculator.calculate(val1, val2, operator);

        System.out.println(Math.round(res * 100) / 100.d);
    }
}
