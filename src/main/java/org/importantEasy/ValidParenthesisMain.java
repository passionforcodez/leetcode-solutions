package org.importantEasy;

import java.util.Stack;
class ValidParenthesis {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if(!stack.isEmpty() && c == ')' && stack.peek() == '(') {
                        stack.pop();
                    }
                else if (!stack.isEmpty() && c == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else if (!stack.isEmpty() && c == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
    return stack.isEmpty();
    }
}
public class ValidParenthesisMain {
    public static void main (String[] args) {
        String s = "(){[]}";
        ValidParenthesis validParenthesis = new ValidParenthesis();
        System.out.println("The given array is Valid: "+ validParenthesis.isValid(s));
    }
}
