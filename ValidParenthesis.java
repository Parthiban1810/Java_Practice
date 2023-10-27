package Java_Practice;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("{{}}"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()
        ) {

            if(x=='('){

                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }
        System.out.print(stack);


        return stack.isEmpty();
    }
}
