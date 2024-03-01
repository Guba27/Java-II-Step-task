package Task1;

import java.util.Stack;

public class ArithmeticExpressionEvaluator {
    public static void main(String[] args){
        String expression = "5+20-8+5";
        System.out.println(evaluateExpression(expression));
    }
    public static int evaluateExpression(String expression) {
        if (expression == null || expression.isEmpty()){
            System.out.println("Invalid expression");
        }
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        int number = 0;
        char[] chars = expression.toCharArray();

        for (char c : chars) {
            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else {
                numbers.push(number);
                number = 0;

                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) {
                    performOperation(numbers, operators);
                }

                operators.push(c);
            }

        }
        numbers.push(number);

        while (!operators.isEmpty()) {
            performOperation(numbers, operators);
        }

        return numbers.pop();
    }
    private static boolean hasPrecedence(char op1, char op2) {
        return (op2 == '+' || op2 == '-') && (op1 == '+' || op1 == '-');
    }
    private static void performOperation(Stack<Integer> numbers, Stack<Character> operators) {
        char operator = operators.pop();
        int num2 = numbers.pop();
        int num1 = numbers.pop();

        if (operator == '+') {
            numbers.push(num1 + num2);
        } else if (operator == '-') {
            numbers.push(num1 - num2);
        }
    }
}
