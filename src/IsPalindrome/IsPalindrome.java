package IsPalindrome;

/**
 * @description:
 * @author: wwh
 * @create: 2020/8/19
 */
public class IsPalindrome {
    public static void main(String[] args) {
        int a = 12321;
        System.out.println(isPalindrome(a));
    }
    public static boolean isPalindrome(int x) {
        if (x<0){
            return false;
        }
        StringBuffer str = new StringBuffer("'"+x+"'");
        String str_copy = str.toString();
        String str_roll = str.reverse().toString();

        if (str_copy.equals(str_roll)){
            return true;
        }
        System.out.println(x);
        return false;
    }
}
