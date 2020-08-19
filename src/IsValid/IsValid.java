package IsValid;

import java.util.Stack;

/**
 * @description: 20. 有效的括号
 * @author: wwh
 * @create: 2020/8/14
 */
public class IsValid {
    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        if (s.length()%2 != 0 ){
            return false;
        }
        Stack stack = new Stack();
        for (int i = 0 ; i < s.length(); ++i){
            if (s.charAt(i) == '}'){
                if (stack.empty()){
                    return false;
                }
                char c = (char)stack.pop();
                if (c != '{'){
                    return false;
                }
            }else  if(s.charAt(i)== ']'){
                if (stack.empty()){
                    return false;
                }
                char c = (char)stack.pop();
                if (c != '['){
                    return false;
                }
            }else  if(s.charAt(i)== ')'){
                if (stack.empty()){
                    return false;
                }
                char c = (char)stack.pop();
                if (c != '('){
                    return false;
                }
            }
            else {
                stack.push(s.charAt(i));
            }
        }
        if (stack.empty()){
            return true;
        }
        return false;
    }
}
