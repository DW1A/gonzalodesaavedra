package codeWars;

import java.util.*;

public class MathEvaluator {
    public static double evaluateExpression(String expression) {
        Deque<Double> values = new ArrayDeque<>();
        Deque<Character> operators = new ArrayDeque<>();
        Map<Character, Integer> precedence = Map.of('+', 1, '-', 1, '*', 2, '/', 2);
        
        expression = expression.replaceAll("\s+", "");
        
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            
            if (Character.isDigit(ch) || ch == '.') {
                StringBuilder sb = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    sb.append(expression.charAt(i++));
                }
                i--;
                values.push(Double.parseDouble(sb.toString()));
            } else if (ch == '(') {
                operators.push(ch);
            } else if (ch == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    applyOperator(values, operators.pop());
                }
                operators.pop();
            } else if (precedence.containsKey(ch)) {
                while (!operators.isEmpty() && precedence.getOrDefault(operators.peek(), 0) >= precedence.get(ch)) {
                    applyOperator(values, operators.pop());
                }
                operators.push(ch);
            }
        }
        
        while (!operators.isEmpty()) {
            applyOperator(values, operators.pop());
        }
        
        return values.pop();
    }
    
    private static void applyOperator(Deque<Double> values, char operator) {
        double right = values.pop();
        double left = values.pop();
        switch (operator) {
            case '+': values.push(left + right); break;
            case '-': values.push(left - right); break;
            case '*': values.push(left * right); break;
            case '/': values.push(left / right); break;
        }
    }
    
    public static void main(String[] args) {
        String expr = "(2 / (2 + 3.33) * 4) - -6";
        System.out.println(evaluateExpression(expr));
    }
}