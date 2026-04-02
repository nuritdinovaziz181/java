import java.util.*;

public class ExpressionCalculator {

    public static double evaluate(String expr) {
        Stack<Double> numbers = new Stack<>();
        Stack<String> ops = new Stack<>();

        String[] tokens = expr.split(" ");

        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                numbers.push(Double.parseDouble(token));
            } else {
                while (!ops.isEmpty() && priority(ops.peek()) >= priority(token)) {
                    double b = numbers.pop();
                    double a = numbers.pop();
                    numbers.push(applyOp(a, b, ops.pop()));
                }
                ops.push(token);
            }
        }

        while (!ops.isEmpty()) {
            double b = numbers.pop();
            double a = numbers.pop();
            numbers.push(applyOp(a, b, ops.pop()));
        }

        return numbers.pop();
    }

    public static int priority(String op) {
        if (op.equals("+") || op.equals("-")) return 1;
        if (op.equals("*") || op.equals("/")) return 2;
        return 0;
    }

    public static double applyOp(double a, double b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        String expr = "2 + 3 * 4";
        System.out.println("Result: " + evaluate(expr));
    }
}