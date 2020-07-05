package Java_Core.Task_13_and_14;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    EXPONENTION("^"),
    SQRT("sqrt"),
    LOG("log");

    private final String value;

    public static Operator getOperatorFromString(String value) {
        for(Operator operator : Operator.values()) {
            if(operator.value.equalsIgnoreCase(value)) {
                return operator;
            }
        }
        throw new IllegalArgumentException();
    }

    private Operator(String value) {
        this.value = value;
    }
}
