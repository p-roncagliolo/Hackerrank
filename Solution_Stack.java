
import java.util.*;
import java.util.Scanner;

public class Solution_Stack {

    private static boolean isBalanced(String expression) {
        if ((expression.length() & 1) == 1)
            return false;

        char[] brackets = expression.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char bracket : brackets)
            switch (bracket) {
                case '{':
                case '[':
                case '(':
                    stack.push(bracket);
                    break;
                case ']':
                    if (!stack.empty() && '[' == stack.peek())
                        stack.pop();
                    else
                        stack.push(bracket);
                    break;
                case ')':
                    if (!stack.empty() && '(' == stack.peek())
                        stack.pop();
                    else
                        stack.push(bracket);
                    break;
                case '}':
                    if (!stack.empty() && '{' == stack.peek())
                        stack.pop();
                    else
                        stack.push(bracket);
                    break;
            }
        return stack.empty();
    }

    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String expression = sc.next();
            System.out.println(isBalanced(expression) ? "true" : "false");
        }
        sc.close();
    }

}
