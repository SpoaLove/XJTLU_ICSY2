package cn.edu.xjtlu.cpt102.lec;

import java.util.*;


public class Lec5 {
    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
    static boolean isRightPar(char c) {
        return c == '}' || c == ']' || c == ')';
    }
    static boolean isLeftPar(char c) {
        return c == '{' || c == '[' || c == '(';
    }
    static boolean isMatch(char lhs, char rhs) {
        return (lhs == '(' && rhs == ')')
            || (lhs == '[' && rhs == ']')
            || (lhs == '{' && rhs == '}');
    }
    static String infixToPostfix(String str) {
        if (!matchingPar(str))
            throw new IllegalArgumentException("Expression must have matching parenthesis");
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c: str.toCharArray()) {
            if (isOperator(c))
                st.push(c);
            else if (isLeftPar(c)) {
                sb.append(c);
                st.push(c);
            } else if (isRightPar(c)) {
                while (!st.isEmpty() && !isLeftPar(st.peek()))
                    sb.append(st.pop());
                st.pop();
                sb.append(c);
            } else
                sb.append(c);
        }
        while (!st.isEmpty())
            sb.append(st.pop());
        return sb.toString();
    }
    static boolean matchingPar(String str) {
        Stack<Character> st = new Stack<>();
        for (char c: str.toCharArray()) {
            if (isLeftPar(c)) st.push(c);
            if (isRightPar(c) && !st.isEmpty() && !isMatch(st.pop(), c))
                return false;
        }
        return true;
    }
    static double performOperation(double op1, double op2, char opr) {
        switch (opr) {
            case '+':
                return op1 + op2;
            case '-':
                return op1 - op2;
            case '*':
                return op1 * op2;
            case '/':
                return op1 / op2;
            case '^':
                return Math.pow(op1, op2);
        }
        return 0;
    }
    static double evaluatePostfix(String str) {
        Stack<Double> st = new Stack<>();
        for (char c: str.toCharArray()) {
            if (isOperator(c) || c == '^') {
                double operandTwo = st.pop();
                double operandOne = st.pop();
                double result = performOperation(operandOne,operandTwo,c);
                st.push(result);
            } else if (Character.isDigit(c)) {
                st.push(Double.parseDouble(""+c));
            }
        }
        return st.peek();
    }
    static Map<String,Integer> frequencyMap(Scanner sc) {
        Map<String, Integer> map = new HashMap<>();
        while (sc.hasNext()) {
            String str = sc.next();
            if (str.equals(".")) break;
            if (!map.containsKey(str))
                map.put(str, 1);
            else
                map.put(str,map.get(str) + 1);
        }
        return map;
    }
    static String findMaxCount(Map<String,Integer> counts) {
        int maxCount = 0;
        String maxWord = "";
        for (HashMap.Entry<String, Integer> entry :counts.entrySet()) {
            if (entry.getValue() > maxCount)
                maxWord = entry.getKey();
        }
        return maxWord;
    }


    static class NumberSequence implements Iterable<Integer> {
        private int m;
        private int b;

        public NumberSequence(int m, int b) {
            this.m = m;
            this.b = b;
        }

        public int getGradient() {
            return m;
        }

        public int getStep() {
            return b;
        }

        @Override
        public Iterator<Integer> iterator() {
            return new NumberSequenceIterator(this);
        }
    }

    static class NumberSequenceIterator implements Iterator<Integer> {
        private int next;
        private NumberSequence numberSequence;

        public NumberSequenceIterator(NumberSequence numberSequence) {
            this.numberSequence = numberSequence;
        }

        @Override
        public boolean hasNext() {
            return next < 100000;
        }

        @Override
        public Integer next() {
            next = numberSequence.getGradient() * next + numberSequence.getStep();
            return next;
        }
    }

    public static void main(String[] args) {
        NumberSequence ns = new NumberSequence(15, 8);
        for (Integer i: ns) {
            System.out.println(i);
        }
    }

}



