class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            // If token is a number
            if (!token.equals("+") &&
                !token.equals("-") &&
                !token.equals("*") &&
                !token.equals("/")) {
                    stack.push(Integer.parseInt(token));
            }
            // If token is an operator
            else {
                int num2 = stack.pop();
                int num1 = stack.pop();
                if (token.equals("+")) {
                    stack.push(num1 + num2);
                }
                else if (token.equals("-")) {
                    stack.push(num1 - num2);
                }
                else if (token.equals("*")) {
                    stack.push(num1 * num2);
                }
               else {
                    stack.push(num1 / num2);
                }
            }
        }
        return stack.pop();
    }
}