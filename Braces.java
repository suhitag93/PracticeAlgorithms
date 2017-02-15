import java.util.*;
public class Braces {
    static boolean Check_String(String str){
        Stack<Character> stack = new Stack<Character>();
        char c;
        for(int j = 0;j<str.length();j++)
        {
            c = str.charAt(j);
            if(c=='{' || c=='[' || c=='(')
                stack.push(c);
            else if(c==')'){
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                	stack.pop();
                else
                	return false;
            }
            else if(c=='}'){
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                	stack.pop();
                else
                	return false;
            }
            else if(c==']'){
                if(stack.empty())
                    return false;
                else if(stack.peek() == '[')
                	stack.pop();
                else 
                	return false;
            }
                
        }    
        return stack.empty();
    }

    
    public static void main(String args[]){
    	String str= "{}[]()";
    	System.out.print(Check_String(str));
    }

}
