import java.util.Stack;

public class perinthesis {
   Stack<Integer> stack = new Stack<>();
   public boolean isPerinthesis(String s) {
    for(int i=0;i<s.length();i++) {
        char ch = s.charAt(i);
        if(ch == '(') {
            stack.push(ch);
        }
        else if(ch == ')') {
            if(stack.isEmpty()) {
                    return false;
                }
            else {
                   stack.pop();
                }
                    }
                    }
                    return stack.isEmpty();
                    }
                    
}
