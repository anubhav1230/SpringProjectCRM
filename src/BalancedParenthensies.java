import java.util.Stack;

public class BalancedParenthensies {

    public static void main(String args[]) {

        System.out.println(balancedParenthensies("{(a,b)}"));
        System.out.println(balancedParenthensies("{(a},b)"));
        System.out.println(balancedParenthensies("{)(a,b}"));
    }

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        
        for(int i=0; i<s.length();i++) {
        
        if(s.charAt(i)=='['|| s.charAt(i)=='{' || s.charAt(i)=='(') {
            
            stack.push(s.charAt(i));
            
        }
        else if(s.charAt(i)==']') {
            
            if(stack.isEmpty() || stack.pop()!= '[')
            
            return false;
            
            
            
        }
        
        else if(s.charAt(i)=='}') {
          if(stack.isEmpty() || stack.pop()!= '{') 
            
            
            
            return false;
            
            
            
        }
         else if(s.charAt(i)==')') {
          if(stack.isEmpty() || stack.pop()!= '(') 
             
             
             
             return false;
             
             
             
         }
        
        }
        return stack.isEmpty();
    }
}