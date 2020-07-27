package IsSubsequence;

/**
 * @description: 判断子序列
 * @author: wwh
 * @create: 2020/7/27
 */
public class isSubsequence {
    public static void main(String[] args) {
       String s = "b", t = "c";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        int i=0,j=0;
        if (s.length()==0){
            return true;
        }
        if (s.length()>t.length()){
            return false;
        }
        while (true){
            if (s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else {
                j++;
            }
            if (i>s.length()-1){
                return true;
            }
            if (j > t.length()-1) {
                return false;
            }
        }
    }
}
